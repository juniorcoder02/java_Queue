import java.util.Stack;

public class QueueUsingTwoStacks {

    // Queue implementation using two stacks
    static class Queue {
        static Stack<Integer> s1 = new Stack<>(); // Main stack to hold elements
        static Stack<Integer> s2 = new Stack<>(); // Temporary stack for reversing

        // Check if the queue is empty
        public static boolean isEmpty() { // Time Complexity: O(1)
            return s1.isEmpty(); // Queue is empty if s1 is empty
        }

        // Enqueue operation: Add an element to the queue
        public static void enQueue(int data) { // Time Complexity: O(n)
            // Step 1: Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop()); // Move top of s1 to s2
            }

            // Step 2: Push the new element into s1
            s1.push(data);

            // Step 3: Move all elements back from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop()); // Move top of s2 back to s1
            }
        }

        // Dequeue operation: Remove the front element from the queue
        public static int deQueue() { // Time Complexity: O(1)
            // Check if the queue is empty
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1; // Return -1 for an empty queue
            }

            // Step 1: Retrieve and remove the top element from s1 (front of the queue)
            int front = s1.peek();
            s1.pop(); // Remove the top element
            return front; // Return the dequeued element
        }

        // Peek operation: Retrieve the front element without removing it
        public static int peek() { // Time Complexity: O(1)
            // Check if the queue is empty
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1; // Return -1 for an empty queue
            }

            // Step 1: Return the top element of s1 (front of the queue)
            return s1.peek();
        }
    }

    // Main method to test the Queue implementation
    public static void main(String[] args) {
        // Create a queue
        Queue q = new Queue();

        // Add elements to the queue
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        // Dequeue and print elements from the queue
        while (!q.isEmpty()) {
            System.out.println(q.deQueue()); // Print and remove the front element
        }
    }
}
