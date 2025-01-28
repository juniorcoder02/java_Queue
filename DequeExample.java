import java.util.*;

// Class to demonstrate basic operations on a Deque
public class DequeExample {
    public static void main(String[] args) {
        // Step 1: Initialize a Deque using LinkedList
        Deque<Integer> deque = new LinkedList<>();

        // Step 2: Add elements to the Deque
        deque.addFirst(1); // Adds 1 to the front of the Deque
        deque.addLast(2);  // Adds 2 to the rear of the Deque
        System.out.println("After adding 1 to the front and 2 to the rear: " + deque);

        // Step 3: Remove the first element
        deque.removeFirst(); // Removes the element at the front (1)
        System.out.println("After removing the first element: " + deque);

        // Step 4: Add more elements to the Deque
        deque.addLast(3); // Adds 3 to the rear
        deque.addLast(4); // Adds 4 to the rear
        deque.addLast(5); // Adds 5 to the rear
        System.out.println("After adding 3, 4, 5 to the rear: " + deque);

        // Step 5: Remove the last element
        deque.removeLast(); // Removes the element at the rear (5)
        System.out.println("After removing the last element: " + deque);
    }
}
