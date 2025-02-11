import java.util.*;

public class ReverseKElementsQueue {
    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        if (queue.isEmpty() || k > queue.size() || k <= 0) {
            return queue; // No changes needed
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push the first K elements onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Step 2: Enqueue the reversed elements back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: Move the remaining (n-k) elements to the back to maintain order
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }

        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        int k = 5;

        Queue<Integer> result = reverseFirstK(queue, k);

        // Print the updated queue
        System.out.println(result); // Output: [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
    }
}
// Time Complexity: O(N), where N is the number of elements in the queue.
