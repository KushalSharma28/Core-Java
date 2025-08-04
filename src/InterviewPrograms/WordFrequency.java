package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency 
{
	// Word Frequency using Manual Iteration
	/*public static void main(String[] args) 
	{
		String str = "this is test this is another test";
        String[] words = str.split(" ");

        // Arrays to store unique words and their counts
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        
        int uniqueCount = 0;  // Current number of unique words stored

        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
            boolean found = false;

            // Check if word already exists in uniqueWords
            for (int j = 0; j < uniqueCount; j++) 
            {
                if (uniqueWords[j].equals(word)) 
                {
                    counts[j]++;
                    found = true;
                    break;
                }
            }

            // If not found, add to uniqueWords and set count to 1
            if (!found) 
            {
                uniqueWords[uniqueCount] = word;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Print results
        for (int i = 0; i < uniqueCount; i++) 
        {
            System.out.println(uniqueWords[i] + " : " + counts[i]);
        }

	}*/

	//Word frequency using Hash Map
	public static void main(String[] args) 
	{
		String input = "this is test this is another test";

		// Convert to lowercase and split by whitespace
		String[] words = input.toLowerCase().split("\\s+");

		// Create a HashMap to store word frequencies
		Map<String, Integer> wordCount = new HashMap<>();

		// Count occurrences
		for (String word : words) 
		{
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}

		// Print word frequencies
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) 
		{
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
