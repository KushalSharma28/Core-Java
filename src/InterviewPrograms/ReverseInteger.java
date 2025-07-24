package InterviewPrograms;

import java.util.Scanner;

public class ReverseInteger 
{
	/*
	//Static Input Given
	public static void main(String[] args) {
		int num=12345;
		int reverse=0;
		
		while(num!=0)
		{
			int digit = num%10;
			reverse = reverse*10 + digit;
			num /= 10;
		}
		System.out.println("Reverse= "+reverse);

	}*/

	//Input given by User
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Interger");
		int num=scan.nextInt();
		int reverse=0;
		
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		System.out.println(reverse);
	}
}
