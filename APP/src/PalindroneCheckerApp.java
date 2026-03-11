import java.util.Scanner;
import java.util.Stack;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome validation algorithms
 * can be selected dynamically at runtime using the Strategy Design Pattern.
 */
public class PalindroneCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // We can inject different strategies here
        PalindromeStrategy strategy = new StackStrategy();

        // The context executes the selected algorithm
        boolean isPalindrome = strategy.isValid(input);

        System.out.println("Validation Result (using Stack Strategy): " + isPalindrome);
        scanner.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/**
 * CLASS - StackStrategy
 * Implements a concrete Stack-based validation strategy.
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isValid(String input) {
        if (input == null || input.isEmpty()) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return input.equalsIgnoreCase(reversed.toString());
    }
}