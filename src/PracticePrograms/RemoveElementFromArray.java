package PracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		int[] originalArray = {677, 12, 233, 78, 45};
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the element to remove
        System.out.print("Enter the element you want to remove: ");
        int elementToRemove = scanner.nextInt(); // Read the integer input from the user

        // Find the index of the element to remove.
        // This is important because if the element isn't found, we shouldn't attempt to resize the array.
        int indexToRemove = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == elementToRemove) {
                indexToRemove = i;
                break; // Element found, exit the loop
            }
        }

        if (indexToRemove == -1) {
            System.out.println("Element " + elementToRemove + " not found in the array. No element removed.");
        } else {
            // Create a new array that will be one element smaller than the original
            int[] newArray = new int[originalArray.length - 1];
            int newArrayIndex = 0; // Index for the newArray

            // Iterate through the original array
            for (int i = 0; i < originalArray.length; i++) {
                // If the current element is NOT the one we want to remove, copy it to the new array
                if (i != indexToRemove) {
                    newArray[newArrayIndex] = originalArray[i];
                    newArrayIndex++; // Increment the index for the new array
                }
            }
            System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));
        }

        scanner.close(); // Close the scanner to prevent resource leaks
        
	}

}
