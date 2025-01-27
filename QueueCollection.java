import java.util.*; // Importing required classes from the java.util package

public class QueueCollection {
    public static void main(String[] args) {

        // Creating a Queue using ArrayDeque
        // Queue is an interface, and ArrayDeque is one of the classes that implements it.
        Queue<Integer> q = new ArrayDeque<>();

        /*
         * Adding elements to the queue:
         * - The `add()` method adds elements to the end (rear) of the queue.
         * - If the queue capacity is full, `add()` will throw an exception.
         */
        q.add(1); // Add 1 to the queue
        q.add(2); // Add 2 to the queue
        q.add(3); // Add 3 to the queue

        /*
         * Loop through the queue:
         * - While the queue is not empty, retrieve and print the front element
         *   using `peek()`, and then remove it using `remove()`.
         */
        while (!q.isEmpty()) {
            /*
             * `peek()`:
             * - Retrieves the front element without removing it.
             * - Returns `null` if the queue is empty.
             */
            System.out.println(q.peek()); // Print the front element

            /*
             * `remove()`:
             * - Removes and returns the front element of the queue.
             * - Throws `NoSuchElementException` if the queue is empty.
             */
            q.remove(); // Remove the front element
        }
    }
}
