package InterviewPrograms;

import java.util.Scanner;

public class FactorialNumber {
	public static int factorial(int num)
	{
		int n=1;
		
		for(int i=1;i<=num;i++)
		{
			n=n*i;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = scan.nextInt();
	
		int ans = factorial(number);
		System.out.println("Given number's Factorial is " + ans);
		scan.close();

	}

}
