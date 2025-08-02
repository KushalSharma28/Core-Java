package InterviewPrograms;

import java.util.HashMap;
import java.util.Scanner;
//import java.util.Map;

public class CharacterOccurrence 
{

	/*
		//Input Defined in Programming
		public static void main(String[] args) 
		{
			String inputString = "This is a test string";
	        Map<Character, Integer> charCounts = calculateConcurrence(inputString);

	        System.out.println("Character Concurrence in the string:");
	        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) 
	        {
	            System.out.println("Character '" + entry.getKey() + "': " + entry.getValue());
	        }
		}
		public static Map<Character, Integer> calculateConcurrence(String str) 
		{
	        Map<Character, Integer> charCounts = new HashMap<>();
	        
	        for (char c : str.toCharArray()) 
	        {
	            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
	        }
	        
	        return charCounts;
	    }*/
		
		//Input Given by User
		/*public static void main(String []args)
	    {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a string: ");
	       String inputString = scanner.nextLine();
	       scanner.close();

	       HashMap<Character, Integer> charCountMap = new HashMap<>();

	       for (char c : inputString.toCharArray()) 
	       {
	           charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	       }

	       System.out.println("Character Concurrence:");
	       for (Character key : charCountMap.keySet()) 
	       {
	           System.out.println(key + ": " + charCountMap.get(key));
	       }
	    }*/
		
		//Character Occurrence without using HashMap
		public static void main(String[] args)
		{
			String input = "this is test this is another test";

	        // Assuming ASCII characters, 128 possible characters
	        int[] charCount = new int[128];

	        // Count each character's occurrence
	        for (int i = 0; i < input.length(); i++) 
	        {
	            char c = input.charAt(i);
	            // Only count if character is in the ASCII range
	            if (c < 128) 
	            {
	                charCount[c]++;
	            }
	        }

	        // Print characters and their counts (only those with count > 0)
	        for (int i = 0; i < 128; i++) 
	        {
	            if (charCount[i] > 0) 
	            {
	                System.out.println("'" + (char) i + "' : " + charCount[i]);
	            }
	        }
		}
	}
