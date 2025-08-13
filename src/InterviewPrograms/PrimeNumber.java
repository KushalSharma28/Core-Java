package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scan.nextInt();
		scan.close();
		
		int p;
		for(p=2; p<=num; ++p)
		{
			if(num%p==0)
			{
				break;
			}
			else if(p==num)
			{
				System.out.println("it is a prime number");
			}
			else
			{
				System.out.println("it is a prime number");
			}
		}
	}

}
