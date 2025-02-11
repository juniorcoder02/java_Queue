import java.util.*;

public class BinaryNumbers {

    // Function to generate binary numbers from 1 to N
    public static void generateBinaryNumbers(int N) {
        // Step 1: Create a queue to store binary numbers as strings
        Queue<String> queue = new LinkedList<>();

        // Step 2: Start with the first binary number "1"
        queue.add("1");

        // Step 3: Process numbers from 1 to N
        for (int i = 0; i < N; i++) {
            // Step 3.1: Remove the front element from the queue
            String binary = queue.poll();

            // Step 3.2: Print the current binary number
            System.out.print(binary + " ");

            // Step 3.3: Generate the next two binary numbers by appending '0' and '1'
            queue.add(binary + "0"); // Append '0' and enqueue
            queue.add(binary + "1"); // Append '1' and enqueue
        }
    }

    public static void main(String[] args) {
        // Step 4: Input the value of N
        int N = 5; // Example: Generate binary numbers from 1 to 5

        // Step 5: Call the function to generate binary numbers
        generateBinaryNumbers(N);
    }

}
