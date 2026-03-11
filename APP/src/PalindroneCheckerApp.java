import java.util.Scanner;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 3: Reverse String Based Palindrome Check
 * * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 * * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * * This introduces transformation-based validation.
 * * @author Developer
 * @version 3.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to check: ");
        String input = scanner.nextLine();

        String reversed = "";

        // Iterate from the last character to the first as per hint
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare the original string with the reversed version
        // Using equalsIgnoreCase to make it user-friendly
        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        // Display results
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}