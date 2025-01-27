public class CircularArrayQueue {
    // Static class to define the Queue
    static class Queue {
        static int[] arr; // Array to store elements of the queue
        static int size;  // Maximum size of the queue
        static int rear;  // Points to the last element in the queue
        static int front; // Points to the first element in the queue

        // Constructor to initialize the queue
        Queue(int n) {
            arr = new int[n]; // Initialize the array with size n
            size = n;         // Set the maximum size of the queue
            rear = -1;        // Initially, rear is -1 (queue is empty)
            front = -1;       // Initially, front is -1 (queue is empty)
        }

        // Check if the queue is empty
        public static boolean isEmpty() { // Time Complexity: O(1)
            return rear == -1 && front == -1; // Queue is empty when both rear and front are -1
        }

        // Check if the queue is full
        public static boolean isFull() { // Time Complexity: O(1)
            return (rear + 1) % size == front; // Queue is full if the next position of rear is front
        }

        // Add an element to the queue
        public static void add(int value) { // Time Complexity: O(1)
            // Check if the queue is full
            if (isFull()) {
                System.out.println("Queue is full"); // Overflow condition
                return;
            }
            // If the queue is empty, initialize front
            if (front == -1) {
                front = 0; // Set front to 0 when adding the first element
            }
            // Increment rear in a circular manner and add the element
            rear = (rear + 1) % size;
            arr[rear] = value;
        }

        // Remove an element from the queue
        public static int remove() { // Time Complexity: O(1)
            // Check if the queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty"); // Underflow condition
                return -1;
            }
            // Retrieve the element at the front
            int frontValue = arr[front];
            // If there's only one element left, reset the queue
            if (front == rear) {
                front = rear = -1; // Reset both front and rear
            } else {
                // Increment front in a circular manner
                front = (front + 1) % size;
            }
            return frontValue; // Return the removed element
        }

        // Retrieve the front element without removing it
        public static int peek() { // Time Complexity: O(1)
            // Check if the queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty"); // Underflow condition
                return -1;
            }
            // Return the front element
            return arr[front];
        }
    }

    // Main method to test the Circular Queue implementation
    public static void main(String[] args) {
        // Create a queue with a size of 5
        Queue q = new Queue(5);

        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        // Remove and print elements
        System.out.println(q.remove()); // Output: 1
        q.add(5);                       // Add an element to the circular queue
        System.out.println(q.remove()); // Output: 2
        q.add(6);                       // Add another element

        // Print and remove elements until the queue is empty
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Print the front element
            q.remove();                   // Remove the front element
        }
    }
}
