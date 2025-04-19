package InterviewPrograms;

import java.util.Scanner;

public class SumOfNumbersInString 
{

	public static void main(String[] args) 
	{
		String str;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string =");
		str=sc.nextLine();
		
		int sum=0;
		String[] a=str.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			try 
			{
				int num=Integer.parseInt(a[i]);
				sum = sum + num;
			}
			catch(NumberFormatException e)
			{
			}
		}
		System.out.println("Sum of String = " + str + " \n " + sum );
		sc.close();

	}

}
