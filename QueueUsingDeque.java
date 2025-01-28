import java.util.*;

// Class to implement Queue using Deque
public class QueueUsingDeque {

    // Custom Queue implementation
    static class Queue {
        // Using Deque to store queue elements
        Deque<Integer> q = new LinkedList<>();

        // Method to add an element to the queue (enqueue)
        public void add(int data) {
            q.addLast(data); // Adds the element at the rear of the queue
        }

        // Method to remove an element from the queue (dequeue)
        public int remove() {
            return q.removeFirst(); // Removes the element from the front of the queue
        }

        // Method to get the front element without removing it (peek)
        public int peek() {
            return q.getFirst(); // Returns the first element of the queue
        }
    }

    public static void main(String[] args) {
        // Step 1: Initialize a custom Queue
        Queue q = new Queue();

        // Step 2: Add elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);

        // Step 3: Peek the first element
        System.out.println("Peek: " + q.peek()); // Output: Peek: 1

        // Step 4: Remove and print elements one by one
        System.out.println(q.remove()); // Removes and prints 1
        System.out.println(q.remove()); // Removes and prints 2
        System.out.println(q.remove()); // Removes and prints 3
    }
}
