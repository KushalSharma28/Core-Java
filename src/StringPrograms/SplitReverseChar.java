package StringPrograms;

import java.util.Scanner;

public class SplitReverseChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String x = sc.nextLine();
		
		for(int i=x.length()-1;i>=0;i--)
		{
			System.out.println(x.charAt(i));
		}
		sc.close();

	}

}
