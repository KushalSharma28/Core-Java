package ArraysPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdHighestIntegerArray 
{
	// From an integer array, find the third highest number (without hardcoding index), and print all other element
	/*public static void main(String[] args) 
	{
		int[] arr = {21, 19, 15, 10, 9, 8, 7};

		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArr);

		int thirdHighest = sortedArr[sortedArr.length - 3];
		System.out.println("Third highest: " + thirdHighest);

		for (int num : arr) 
		{
			if (num != thirdHighest) 
			{
		 		System.out.println(num);
			}
		}
	}
	*/
	
	public static void main(String[] args) 
	{
        int[] numbers1 = {10, 5, 20, 8, 15, 20, 5, 25};
        findThirdHighestAndOthers(numbers1);

        int[] numbers2 = {1, 2, 3}; // Case with exactly 3 distinct elements
        findThirdHighestAndOthers(numbers2);

        int[] numbers3 = {5, 5, 5}; // Case with all same elements
        findThirdHighestAndOthers(numbers3);

        int[] numbers4 = {10, 5}; // Case with less than 3 distinct elements
        findThirdHighestAndOthers(numbers4);

        int[] numbers5 = {}; // Empty array
        findThirdHighestAndOthers(numbers5);
    }

    public static void findThirdHighestAndOthers(int[] arr) 
    {
        System.out.println("Original Array: " + Arrays.toString(arr));

        if (arr == null || arr.length == 0) 
        {
            System.out.println("Array is empty or null. No elements to process.\n");
            return;
        }

        // 1. Remove duplicates and sort in descending order
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : arr) 
        {
            uniqueNumbers.add(num);
        }

        // Convert to a List for easy sorting
        java.util.List<Integer> sortedUniqueNumbers = new java.util.ArrayList<>(uniqueNumbers);
        Collections.sort(sortedUniqueNumbers, Collections.reverseOrder());

        // 2. Find the third highest number
        if (sortedUniqueNumbers.size() < 3) 
        {
            System.out.println("There are fewer than three distinct numbers in the array.");
            if (!sortedUniqueNumbers.isEmpty()) 
            {
                System.out.println("Highest number: " + sortedUniqueNumbers.get(0));
                if (sortedUniqueNumbers.size() >= 2) 
                {
                    System.out.println("Second highest number: " + sortedUniqueNumbers.get(1));
                }
            }
            System.out.print("Remaining elements (all if < 3 distinct): ");
            boolean first = true;
            for (int num : arr) 
            {
                if (!first) 
                {
                    System.out.print(", ");
                }
                System.out.print(num);
                first = false;
            }
            System.out.println("\n");
            return;
        }

        int thirdHighest = sortedUniqueNumbers.get(2);
        System.out.println("Third Highest Number: " + thirdHighest);

        // 3. Print all other elements
        System.out.print("All Other Elements: [");
        boolean firstElement = true;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] != thirdHighest) 
            {
                if (!firstElement) 
                {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
                firstElement = false;
            }
        }
        System.out.println("]\n");
    }

}
