import java.util.LinkedList;
import java.util.Scanner;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 8: Linked List Based Palindrome Checker
 * * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 * * Characters are added to the list and then compared
 * by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 * * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 * * @author Developer
 * @version 8.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC8.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Initialize a LinkedList of Characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character of the string to the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare characters by removing from both ends
        // Stop when 0 or 1 character is left
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close();
    }
}