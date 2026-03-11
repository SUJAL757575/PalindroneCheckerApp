import java.util.Scanner;
import java.util.Stack;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 5: Stack Based Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 * * This maps stack behavior to reversal logic.
 * * @author Developer
 * @version 5.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC5.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Initialize a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Step 1: Push all characters of the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Step 2: Pop characters from the stack to build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Step 3: Compare original with reversed
        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        // Display results
        System.out.println("Reversed via Stack: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}