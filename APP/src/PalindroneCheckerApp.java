import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 6: Queue + Stack Fairness Check
 * * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 * * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 * * If all characters match, the input string is confirmed
 * as a palindrome.
 * * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 * * @author Developer
 * @version 6.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC6.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Initialize Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to both structures
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare characters one by one
        while (!queue.isEmpty()) {
            // queue.remove() gets the FIRST character added
            // stack.pop() gets the LAST character added
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}