package test;

import java.util.Arrays;

public class SecondMaxMinFinder {
    public static void main(String[] args) {
        // Input array
        int[] array = {11, 11, 20, 20, 99, 12, 20};
        
        // Check if the array has at least two elements
        if (array.length < 2) {
            System.out.println("Array does not have enough elements.");
            return;
        }
        
        // Sort the array to easily find the second min and max
        Arrays.sort(array);
     //   {99,56,34,23,12,5,1}
        
        // The second minimum number is at index 1 (after sorting)
        int secondMin = array[1];
        
        // The second maximum number is at index length-2 (after sorting)
        int secondMax = array[array.length - 2];
        
        // Output the result
        System.out.println("Second Minimum number: " + secondMin);
        System.out.println("Second Maximum number: " + secondMax);
    }
}
