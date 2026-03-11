import java.util.Scanner;
import java.util.Stack;

/**
 * ===========================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ===========================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution performance
 * of palindrome validation algorithms using System.nanoTime().
 */
public class PalindroneCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text for benchmarking: ");
        String input = scanner.nextLine();

        // Initialize the strategy
        PalindromeStrategy strategy = new StackStrategy();

        // 1. Capture Start Time (in nanoseconds)
        long startTime = System.nanoTime();

        // 2. Execute the algorithm
        boolean result = strategy.isValid(input);

        // 3. Capture End Time
        long endTime = System.nanoTime();

        // 4. Calculate Duration
        long duration = endTime - startTime;

        // Display results
        System.out.println("------------------------------------");
        System.out.println("Algorithm: StackStrategy");
        System.out.println("Is Palindrome: " + result);
        System.out.println("Execution Time: " + duration + " ns");
        System.out.println("------------------------------------");

        scanner.close();
    }
}

/**
 * Strategy Interface (from UC12)
 */
interface PalindromeStrategy {
    boolean isValid(String input);
}

/**
 * Concrete Implementation (from UC12)
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