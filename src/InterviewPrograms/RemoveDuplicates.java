package InterviewPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates 
{
	public static String removeduplicates(String str)
    {
        Set<Character> uniqueChars = new LinkedHashSet<>();

        for (int i=0;i<str.length();i++)
        {
            char currentChar = str.charAt(i);

            uniqueChars.add(currentChar);
        }
        StringBuilder result = new StringBuilder();
        for (Character ch: uniqueChars)
        {
            result.append(ch);
        }
        return result.toString();
    }

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to remove duplicate");
		String input=scan.nextLine();
		
		System.out.println("Original String= "+input);
		
        String result = removeduplicates(input);
        System.out.println("After removing duplicates: " + result);

	}

}
