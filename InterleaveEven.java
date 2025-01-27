import java.util.*;

public class InterleaveEven {

    /**
     * Function to interleave the two halves of a queue.
     * Assumes the queue length is even.
     * 
     * Time Complexity: O(n)
     * - Iterating through the queue to split it: O(n/2).
     * - Rebuilding the interleaved queue: O(n).
     * - Total: O(n).
     * 
     * Space Complexity: O(n)
     * - Auxiliary queue `firstHalf` uses O(n/2) space in the worst case.
     * - Total: O(n).
     */
    public static void interLeave(Queue<Integer> q) {
        // Auxiliary queue to hold the first half of the original queue
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size(); // Total size of the queue (assumed to be even)

        // Step 1: Move the first half of the queue to `firstHalf`
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Step 2: Interleave elements from `firstHalf` and the remaining queue
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // Add an element from the first half
            q.add(q.remove());         // Add an element from the second half
        }
    }

    public static void main(String[] args) {
        // Initialize the queue with an even number of elements
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        // Call the interleave function
        interLeave(q);

        // Print the interleaved queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
