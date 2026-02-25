public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        String reversed = "";

        // Iterate from last character to first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}
