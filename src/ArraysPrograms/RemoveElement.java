package ArraysPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) 
	{
		int[] originalArray = {677, 12, 233, 78, 45};
        int elementToRemove = 78;
        int[] newArray = new int[originalArray.length - 1]; // New array will be one element smaller

        int newArrayIndex = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != elementToRemove) {
                newArray[newArrayIndex] = originalArray[i];
                newArrayIndex++;
            }
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(newArray));
	}

}
