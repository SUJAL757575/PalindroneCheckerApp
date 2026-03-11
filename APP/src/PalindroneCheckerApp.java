import java.util.Scanner;
public class PalindroneCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to check: ");
        String input = scanner.nextLine();

        // Basic preprocessing: remove spaces and convert to lowercase for better accuracy
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        // Loop only till half of the string length
        for (int i = 0; i < cleanInput.length() / 2; i++) {
            if (cleanInput.charAt(i) != cleanInput.charAt(cleanInput.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Displaying the results
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

        scanner.close(); // Good practice to close the scanner
    }
}