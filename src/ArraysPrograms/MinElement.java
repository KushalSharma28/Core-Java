package ArraysPrograms;

public class MinElement 
{
	/*
	public static void main(String[] args) 
	{
		int a[]= {677,12,233,78,45,56,779,430,99};
		
		max(a);
		min(a);
	}
	public static void max(int a[])
	{
		int max = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}

	public static void min(int a[])
	{
		int min = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
		System.out.println(min);
	}*/
	public static void main(String[] args) 
	{
        int[] numbers = {677,12,233,78,45,56,779,430,99};
        int minElement = numbers[0]; // Assume the first element is initially the minimum

        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] < minElement) 
            {
                minElement = numbers[i]; // Update minElement if a smaller value is found
            }
        }

        System.out.println("The minimum element is: " + minElement);
    }
}
