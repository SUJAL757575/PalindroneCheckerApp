import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 7: Deque Based Optimized Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 * * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 * * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 * * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 * * @author Developer
 * @version 7.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC7.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Initialize a Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Add all characters to the deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare from both ends until 0 or 1 character remains
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char back = deque.removeLast();

            if (front != back) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}