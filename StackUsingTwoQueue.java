import java.util.*;

public class StackUsingTwoQueue {

    // Stack implementation using two queues
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>(); // Main queue
        static Queue<Integer> q2 = new LinkedList<>(); // Temporary queue

        // Check if the stack is empty
        public static boolean isEmpty() { // Time Complexity: O(1)
            return q1.isEmpty() && q2.isEmpty(); // Stack is empty if both queues are empty
        }

        // Push operation: Add an element to the stack
        public static void push(int data) { // Time Complexity: O(1)
            // Add the element to the non-empty queue
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // Pop operation: Remove the top element from the stack
        public static int pop() { // Time Complexity: O(n)
            // Check if the stack is empty
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1; // Return -1 for an empty stack
            }

            int top = -1; // To store the top element

            // Case 1: q1 is non-empty
            if (!q1.isEmpty()) {
                // Transfer elements from q1 to q2, leaving the last one
                while (!q1.isEmpty()) {
                    top = q1.remove(); // Remove the front element
                    if (q1.isEmpty()) { // If it's the last element, break
                        break;
                    }
                    q2.add(top); // Otherwise, add it to q2
                }
            }
            // Case 2: q2 is non-empty
            else {
                // Transfer elements from q2 to q1, leaving the last one
                while (!q2.isEmpty()) {
                    top = q2.remove(); // Remove the front element
                    if (q2.isEmpty()) { // If it's the last element, break
                        break;
                    }
                    q1.add(top); // Otherwise, add it to q1
                }
            }

            return top; // Return the removed top element
        }

        // Peek operation: Retrieve the top element without removing it
        public static int peek() { // Time Complexity: O(n)
            // Check if the stack is empty
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1; // Return -1 for an empty stack
            }

            int top = -1; // To store the top element

            // Case 1: q1 is non-empty
            if (!q1.isEmpty()) {
                // Transfer elements from q1 to q2, while keeping track of the last one
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top); // Add each element to q2
                }
            }
            // Case 2: q2 is non-empty
            else {
                // Transfer elements from q2 to q1, while keeping track of the last one
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top); // Add each element to q1
                }
            }

            return top; // Return the top element
        }
    }

    // Main method to test the Stack implementation
    public static void main(String[] args) {
        Stack s = new Stack();

        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);

        // Pop and print elements from the stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
