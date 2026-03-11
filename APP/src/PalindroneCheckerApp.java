import java.util.Scanner;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 10: Normalized Palindrome Validation
 * * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 * * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * * This ensures the palindrome check is logical rather
 * than character-format dependent.
 * * Example:
 * "A man a plan a canal Panama"
 * * @author Developer
 * @version 10.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC10.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a phrase (including spaces/punctuation):");
        String originalInput = scanner.nextLine();

        // Step 1: Normalization
        // [^a-zA-Z0-9] replaces everything that is NOT a letter or number
        String normalized = originalInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Logic (using the efficient two-pointer approach)
        boolean isPalindrome = true;
        int start = 0;
        int end = normalized.length() - 1;

        if (normalized.isEmpty()) {
            isPalindrome = false;
        } else {
            while (start < end) {
                if (normalized.charAt(start) != normalized.charAt(end)) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }
        }

        // Display results
        System.out.println("Original: " + originalInput);
        System.out.println("Normalized: " + normalized);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}