import java.util.*;

public class InterleaveOdd {

    /**
     * Function to interleave the two halves of a queue, handling both even and odd lengths.
     * For odd lengths, the middle element is placed at the end after interleaving.
     * 
     * Time Complexity: O(n)
     * - Splitting the queue into halves: O(n/2).
     * - Interleaving elements: O(n).
     * - Total: O(n).
     * 
     * Space Complexity: O(n)
     * - Auxiliary queue `firstHalf` uses O(n/2) space in the worst case.
     * - Total: O(n).
     */
    public static void interLeave(Queue<Integer> q) {
        // Check if the queue length is less than 2 (nothing to interleave)
        if (q.size() < 2) {
            System.out.println("Queue is too small to interleave!");
            return;
        }

        int size = q.size(); // Total size of the queue
        boolean isOdd = size % 2 != 0; // Check if the size is odd
        int midSize = size / 2; // Midpoint for splitting the queue
        Integer middleElement = null; // Store the middle element if the size is odd

        // Auxiliary queue to hold the first half of the original queue
        Queue<Integer> firstHalf = new LinkedList<>();

        // Step 1: Handle the middle element for odd-length queues
        if (isOdd) {
            midSize = size / 2; // Midpoint (size - 1) / 2
        }

        // Step 2: Move the first half of the queue to `firstHalf`
        for (int i = 0; i < midSize; i++) {
            firstHalf.add(q.remove());
        }

        // If the queue is odd, remove the middle element and store it
        if (isOdd) {
            middleElement = q.remove();
        }

        // Step 3: Interleave elements from `firstHalf` and the remaining queue
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // Add an element from the first half
            q.add(q.remove());         // Add an element from the second half
        }

        // Step 4: If the queue length was odd, add the middle element back to the end
        if (isOdd) {
            q.add(middleElement);
        }
    }

    public static void main(String[] args) {
        // Initialize the queue
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9); // Odd-length queue

        // Call the interleave function
        interLeave(q);

        // Print the interleaved queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
