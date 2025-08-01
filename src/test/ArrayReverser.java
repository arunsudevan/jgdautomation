package test;

import java.util.Arrays;

public class ArrayReverser {
	
    public static void main(String[] args) {
        // Define an array
        int[] array = {1, 2, 3, 4, 5};
        
        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Initialize pointers for start and end
        int start = 0;
        int end = array.length - 1;
        
        // Reverse the array using a while loop
        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move the pointers towards the center
            start++;
            end--;
        }
        // Print the reversed array
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
}
