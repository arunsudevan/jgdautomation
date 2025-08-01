package test;

public class MinMaxFinder {
    public static void main(String[] args) {
        // Input array
        int[] array = {12, 34, 56, 1, 99, 5, 23};
        
        // Check if the array is not empty
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        
        // Initialize max and min with the first element of the array
        int max = array[0];
        int min = array[0];
        
        // Loop through the array to find the max and min
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  // Update max if the current element is greater
            }
            if (array[i] < min) {
                min = array[i];  // Update min if the current element is smaller
            }
        }
        
        // Output the result
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}