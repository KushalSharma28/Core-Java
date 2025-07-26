package ArraysPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscDescSortArray {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		int n=scan.nextInt();
		
		Integer[] arr=new Integer[n];
		System.out.println("Enter Elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		// Sorting in Ascending Order
        Arrays.sort(arr);
        System.out.print("Ascending order: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sorting in Descending Order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Descending order: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        scan.close();
	}
}
