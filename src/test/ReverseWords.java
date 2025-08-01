package test;

public class ReverseWords {
    public static void main(String[] args) {
        // Input string
        String input = "Hello world this is Java";
        
        // Split the string into words using space as a delimiter
        String[] words = input.split(" ");
        
        // Initialize an empty string to store the result
        String reversedString = "";
        
        // Use a for loop to iterate over the words array from the end to the start
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        
        // Trim the trailing space and print the result
     //   reversedString = reversedString.trim();
        
        // Output the reversed word string
        System.out.println("Original: " + input);
        System.out.println("Reversed Words: " + reversedString);
    }
}
