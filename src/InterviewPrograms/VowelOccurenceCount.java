package InterviewPrograms;

public class VowelOccurenceCount 
{
	public static void main(String[] args) 
	{
		String input = "good morning";
        int vowelCount = 0;
        String temp = "";

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        input = input.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                temp += ch; // Store the vowel in temp variable
                vowelCount++; // Increase the counter
            }
        }

        // Print the results
        System.out.println("Vowels found: " + temp);
        System.out.println("Total number of vowels: " + vowelCount);
	}

}
