import java.util.*;

// Class to implement Stack using Deque
public class StackUsingDeque {

    // Custom Stack implementation
    static class Stack {
        // Using Deque to store stack elements
        Deque<Integer> deque = new LinkedList<>();

        // Method to push an element onto the stack
        public void push(int data) {
            deque.addLast(data); // Adds the element to the rear of the Deque
        }

        // Method to pop the top element from the stack
        public int pop() {
            if (deque.isEmpty()) { // Check if the stack is empty
                System.out.println("Stack is empty");
                return -1;
            } else {
                return deque.removeLast(); // Removes the last element (top of stack)
            }
        }

        // Method to peek at the top element without removing it
        public int peek() {
            if (deque.isEmpty()) { // Check if the stack is empty
                System.out.println("Stack is empty");
                return -1;
            } else {
                return deque.peekLast(); // Returns the last element (top of stack)
            }
        }
    }

    public static void main(String[] args) {
        // Step 1: Initialize the custom Stack
        Stack s = new Stack();

        // Step 2: Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);

        // Step 3: Peek the top element
        System.out.println("peek: " + s.peek()); // Output: 3

        // Step 4: Pop elements and print them
        System.out.println("pop: " + s.pop()); // Removes and prints 3
        System.out.println("pop: " + s.pop()); // Removes and prints 2
        System.out.println("pop: " + s.pop()); // Removes and prints 1

        // Step 5: Attempt to pop from an empty stack
        System.out.println("pop: " + s.pop()); // Output: Stack is empty, -1
    }
}
