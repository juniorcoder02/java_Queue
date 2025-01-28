import java.util.*;

// Class to demonstrate queue reversal
public class QueueReversal {

    // Method to reverse the elements of a queue
    public static void reverseQueue(Queue<Integer> q) {
        // Step 1: Create a stack to temporarily store elements
        Stack<Integer> s = new Stack<>();

        // Step 2: Remove elements from the queue and push them onto the stack
        while (!q.isEmpty()) {
            s.push(q.remove()); // Remove from queue and push onto stack
        }

        // Step 3: Pop elements from the stack and add them back to the queue
        while (!s.isEmpty()) {
            q.add(s.pop()); // Pop from stack and add to queue
        }
    }

    // Main method to test the reverseQueue function
    public static void main(String[] args) {
        // Step 4: Initialize a queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // Adding elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Print the original queue
        System.out.println("Original Queue: " + q);

        // Step 5: Reverse the queue
        reverseQueue(q);

        // Print the reversed queue
        System.out.print("Reversed Queue: ");
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
