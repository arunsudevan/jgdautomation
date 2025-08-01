package test;

public class NumberPalindromeChecker {
    public static void main(String[] args) {
        // Input number
        int number = 12321;
        
        // Store the original number
        int originalNumber = number;
        
        // Initialize a variable to store the reversed number
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int lastDigit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;  // Append the last digit to reversedNumber
            number /= 10;  // Remove the last digit from the original number
        }
        
        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println("The number " + originalNumber + " is a palindrome.");
        } else {
            System.out.println("The number " + originalNumber + " is not a palindrome.");
        }
    }
}
