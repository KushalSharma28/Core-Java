package ArraysPrograms;

public class SelectionSort {

	public static void main(String[] args) {
		int a [] = {12,21,23,43,76,12,45,665,32,34,54,56,65,67,76,78,87,98,99,44,55,22};
		
		for(int i=0;i<a.length;i++)
		{
			int index=i;
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
				{
					index = j;
				}
			}
			
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
