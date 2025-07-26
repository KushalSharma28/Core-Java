package ArraysPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDescendingSort 
{
	/*
	public static void sortdescending(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] array= {};
		sortdescending(array);
		System.out.print("Descending Array\n");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
	}*/
	
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
		
		Arrays.sort(arr, Collections.reverseOrder());
        System.out.print("Descending order: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        scan.close();
	}
}
