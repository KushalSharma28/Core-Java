package InterviewPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicates 
{
	// Input given in the array
	/*public static void main(String[] args)
	{
		int[] array = {1, 2, 3, 4, 5, 2, 3, 6}; 
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : array) 
        {
            if (!seen.add(num)) 
            {
                duplicates.add(num); // If num is already in seen, it's a duplicate
            }
        }

        System.out.println("Duplicates in the array: " + duplicates);
	} */
	
	//Taken Input from User in the array
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        // Taking input for the array elements
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
        {
        	array[i] = scanner.nextInt();
        }
        
        // Finding duplicates using HashSet
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : array) 
        {
            if (!seen.add(num)) 
            {
                duplicates.add(num); // If the number is already in seen, it's a duplicate
            }
        }
        
        // Displaying the duplicates
        if (duplicates.isEmpty())
        {
            System.out.println("No duplicates found in the array.");
        } 
        else 
        {
            System.out.println("Duplicates in the array: " + duplicates);
        }

        scanner.close();
	}
}