import java.util.Scanner;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 * * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * * @author Developer
 * @version 11.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate the service object
        PalindromeService service = new PalindromeService();

        System.out.print("Enter text to validate: ");
        String userInput = scanner.nextLine();

        // Call the encapsulated logic via the service object
        boolean result = service.checkPalindrome(userInput);

        System.out.println("Is it a Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Handle null or empty inputs
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Normalize: remove non-alphanumeric and convert to lowercase
        String cleanStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Logic: Two-pointer approach for efficiency
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}