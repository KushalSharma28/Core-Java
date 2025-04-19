package InterviewPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromArray 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Create an array of the specified size
        int[] array = new int[size];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }
        
        // Use a HashSet to remove duplicates
        HashSet<Integer> uniqueElements = new HashSet<>();
        
        for (int num : array) 
        {
            uniqueElements.add(num); // HashSet automatically handles duplicates
        }
        
        // Output the unique elements
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueElements) 
        {
            System.out.print(num + " ");
        }
        
        scanner.close();
	}
}
