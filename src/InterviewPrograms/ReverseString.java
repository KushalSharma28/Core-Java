package InterviewPrograms;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String");
		str = sc.nextLine();
		
		String[] a=str.split(" ");
		String output="";
		
		for(int s=0;s<a.length;s++)
		{
			String original=a[s];
			int j=original.length();
			String reverse = "";
			
			for(int i=j-1;i>=0;i--)
			{
				reverse=reverse + original.charAt(i);
			}
			output=output+reverse+" ";
		}
		System.out.println("Reverse string of " + str +" is ="+ output);
		sc.close();
	}

}
