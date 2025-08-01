package test;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Input string
        String input = "madam"; 
        // Convert the string to lowercase and remove spaces or special characters (optional)
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Initialize a boolean flag to true
        boolean isPalindrome = true;
        
        // Use a for loop to check if the string reads the same forward and backward
        int length = cleanedInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        // Output the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}