import java.util.*;

public class MaxSubarrayK {
    public static List<Integer> maxSubarrayK(int[] arr, int n, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements out of the current window (front of the deque)
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller elements (they will never be the max in this window)
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add the current element index at the back of the deque
            deque.addLast(i);

            // Store the max for the current window (first k elements are handled
            // separately)
            if (i >= k - 1) {
                result.add(arr[deque.peek()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int n = arr.length;
        int k = 3;

        List<Integer> result = maxSubarrayK(arr, n, k);
        System.out.println(result); // Output: [3, 3, 4, 5, 5, 5, 6]
    }
}
