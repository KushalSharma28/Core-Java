package ArraysPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) 
	{
		/*
		int a[] = {31,31,42,63,56,59,67,76,63,31,72,70,80,72};
		
		int b[] = new int[a.length-1];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which element want to you remove : ");
		int num = sc.nextInt();
	
		int min = Integer.MIN_VALUE;
		boolean flag = true;
		while(flag)
		{	
			int s=-1;
		
			for(int i=0;i<a.length;i++)
			{
				if(num==a[i]) 
				{
					s = i;
					a[i]=min;
				}
			}
		
			if(s==-1)
			{
				flag = false;
				break;
			}
			else
			{
				for(int i=0;i<b.length;i++)
				{
					if(i<s)
					{		 
						b[i] = a[i];
					}
					else
					{
						b[i] = a[i+1];
					}
				}
		
			}	
		
		}

		for(int i=0;i<b.length;i++)
		{
			if(a[i]!=min)
			{
				System.out.println(b[i]);		
			}
		}
		 */
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
