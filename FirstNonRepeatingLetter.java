import java.util.*;

public class FirstNonRepeatingLetter {

    /**
     * Function to print the first non-repeating character at each step.
     * Time Complexity: O(n) - We iterate through the string once and each character is added/removed from the queue at most once.
     * Space Complexity: O(n) - For the queue, in the worst case, all characters could be unique and stored in the queue.
     */
    public static void printFirstNonRepeatingLetter(String str) {
        int[] freq = new int[26]; // Frequency array for characters 'a' to 'z' (O(1) space since size is fixed)
        Queue<Character> q = new LinkedList<>(); // Queue to store the characters in order of appearance (O(n) space in worst case)

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Add the character to the queue and update its frequency
            q.add(ch);
            freq[ch - 'a']++;

            // Remove all characters from the front of the queue that are repeated
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // If the queue is empty, no non-repeating character exists
            if (q.isEmpty()) {
                System.out.print("-1 "); // Print -1 if all characters are repeating
            } else {
                System.out.print(q.peek() + " "); // Print the first non-repeating character
            }
        }

        System.out.println(); // Move to the next line after printing all results
    }

    public static void main(String[] args) {
        String str = "aabccxb"; // Input string
        printFirstNonRepeatingLetter(str); // Call the function
    }
}
