package InterviewPrograms;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		// Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to check if it is a palindrome: ");
        String original = sc.nextLine(); // Read the input string

        // Close the scanner as we no longer need it
        sc.close();

        // Convert the string to lowercase to make the check case-insensitive
        original = original.toLowerCase();

        // Assume the string is a palindrome until proven otherwise
        boolean isPalindrome = true;

        // Initialize two pointers, one at the start and one at the end of the string
        int start = 0;
        int end = original.length() - 1;

        // Loop to compare characters from both ends
        while (start < end) 
        {
            // Check if characters at start and end are different
            if (original.charAt(start) != original.charAt(end)) 
            {
                isPalindrome = false; // Mark as not a palindrome
                break; // Exit the loop if a mismatch is found
            }
            // Move pointers towards the center
            start++;
            end--;
        }

        // Output the result
        if (isPalindrome) 
        {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } 
        else 
        {
            System.out.println("The string \"" + original + "\" is not a palindrome.");
        }
	}

}
