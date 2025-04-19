package InterviewPrograms;

import java.util.Scanner;

public class VowelConsonant 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the input to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) 
        {
            // Check if the character is a letter
            if (Character.isLetter(ch)) 
            {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                {
                    vowelCount++;
                } 
                else 
                {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        
        scanner.close();
	}
}
