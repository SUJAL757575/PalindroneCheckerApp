import java.util.Scanner;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 4: Character Array Based Validation
 * * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 * * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * * This reduces extra memory usage.
 * * @author Developer
 * @version 4.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC4.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        // Use the two-pointer technique to compare characters
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++; // Move forward from the beginning
            end--;   // Move backward from the end
        }

        // Display results
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}