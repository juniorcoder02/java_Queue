public class ArrayQueue {
    // Static class to define the Queue
    static class Queue {
        static int[] arr;  // Array to store elements of the queue
        static int size;   // Maximum size of the queue
        static int rear;   // Index of the last element in the queue

        // Constructor to initialize the queue
        Queue(int n) {
            arr = new int[n];  // Initialize the array with size n
            size = n;          // Set the size of the queue
            rear = -1;         // Initially, the queue is empty
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1; // Queue is empty when rear == -1
        }

        // Add an element to the queue
        public static void add(int data) { // Time Complexity: O(1)
            // Check if the queue is full
            if (rear == size - 1) { // If rear reaches the last index
                System.out.println("Queue is full"); // Overflow condition
                return;
            }
            // Increment rear and add the element to the queue
            rear++;
            arr[rear] = data;
        }

        // Remove the front element from the queue
        public static int remove() { // Time Complexity: O(n) due to shifting
            // Check if the queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty"); // Underflow condition
                return -1;
            }
            // Store the front element (element at index 0)
            int front = arr[0];
            // Shift all elements one step to the left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            // Decrement rear to reflect the removal
            rear--;
            return front; // Return the removed element
        }

        // Retrieve the front element without removing it
        public static int peek() { // Time Complexity: O(1)
            // Check if the queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty"); // Underflow condition
                return -1;
            }
            // Return the front element (element at index 0)
            return arr[0];
        }
    }

    // Main method to test the Queue implementation
    public static void main(String[] args) {
        // Create a queue with a size of 5
        Queue q = new Queue(5);

        // Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        // Remove and print elements from the queue until it is empty
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Print the front element
            q.remove();                   // Remove the front element
        }
    }
}
