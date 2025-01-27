public class LinkedlistQueue {
    // Node class to represent each element in the queue
    static class Node {
        int data;  // Data of the node
        Node next; // Reference to the next node

        // Constructor to initialize a node
        Node(int data) {
            this.data = data;
            this.next = null; // By default, the next is null
        }
    }

    // Queue class that uses the Node class
    static class Queue {
        static Node head = null; // Points to the front of the queue
        static Node tail = null; // Points to the rear of the queue

        // Check if the queue is empty
        public static boolean isEmpty() { // Time Complexity: O(1)
            return head == null && tail == null; // Queue is empty if both head and tail are null
        }

        // Add an element to the queue
        public static void add(int data) { // Time Complexity: O(1)
            // Create a new node
            Node newNode = new Node(data);

            // If the queue is empty, set both head and tail to the new node
            if (head == null) {
                head = tail = newNode;
                return;
            }

            // Otherwise, add the new node at the end of the queue
            tail.next = newNode; // Link the current tail to the new node
            tail = newNode;      // Update the tail to the new node
        }

        // Remove an element from the front of the queue
        public static int remove() { // Time Complexity: O(1)
            // Check if the queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot remove.");
                return -1; // Return -1 if the queue is empty
            }

            // Retrieve the front element (data at the head node)
            int front = head.data;

            // If the queue has only one element, reset head and tail to null
            if (head == tail) {
                head = tail = null;
            } else {
                // Move the head pointer to the next node
                head = head.next;
            }

            return front; // Return the removed element
        }

        // Retrieve the front element without removing it
        public static int peek() { // Time Complexity: O(1)
            // Check if the queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot peek.");
                return -1; // Return -1 if the queue is empty
            }

            // Return the data at the head node
            return head.data;
        }
    }

    // Main method to test the Linked List Queue implementation
    public static void main(String[] args) {
        // Create a queue
        Queue q = new Queue();

        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);

        // Remove and print elements until the queue is empty
        while (!q.isEmpty()) {
            System.out.println(q.remove()); // Print and remove elements
        }
    }
}
