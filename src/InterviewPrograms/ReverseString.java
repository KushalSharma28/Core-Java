package InterviewPrograms;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		/*String str;
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
		sc.close();*/
		
		Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String original = sc.nextLine();
        
        /*String reversed = "";

        // Loop from last character to first
        for (int i = original.length() - 1; i >= 0; i--) 
        {
            reversed += original.charAt(i); // append each char from end
        }

        // Display the reversed string
        System.out.println("Reversed string: " + reversed);

        sc.close(); */
        
        char[] chars = original.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) 
        {
            reversed += chars[i];
        }
        System.out.println("Reversed string: " + reversed);
        sc.close();
	}

}
