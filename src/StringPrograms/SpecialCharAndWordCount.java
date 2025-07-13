package StringPrograms;

import java.util.Scanner;

public class SpecialCharAndWordCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // --- Specific Character Occurrence Count ---
        System.out.print("\nEnter a character to count its occurrences: ");
        String charToCountStr = scanner.nextLine();

        // Validate if the user entered exactly one character
        if (charToCountStr.length() != 1) 
        {
            System.out.println("Invalid input for character count. Please enter a single character.");
        } 
        else 
        {
            char targetChar = charToCountStr.toLowerCase().charAt(0); // Convert target char to lowercase
            int charOccurrenceCount = 0;

            // Iterate through the original input string (or its lowercase version)
            // Using the lowercase version of the input string for case-insensitivity
            String lowerCaseInputForCharCount = input.toLowerCase();
            for (char ch : lowerCaseInputForCharCount.toCharArray()) 
            {
                if (ch == targetChar) 
                {
                    charOccurrenceCount++;
                }
            }
            System.out.println("Occurrences of '" + charToCountStr + "': " + charOccurrenceCount);
        }

        // --- Total Word Count ---
        // Trim leading/trailing spaces and split by one or more whitespace characters
        String trimmedInput = input.trim();
        int wordCount = 0;

        if (!trimmedInput.isEmpty()) 
        {
            // Split the string by one or more whitespace characters (spaces, tabs, newlines)
            String[] words = trimmedInput.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("\n--- Word Analysis ---");
        System.out.println("Total number of words: " + wordCount);

        scanner.close();
	}
}
