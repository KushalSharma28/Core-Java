package InterviewPrograms;

public class StringPermutations 
{
    public static void printPermutations(String str, String currentPermutation) 
    {
        // Base case: If the string is empty, a permutation is found
        if (str.length() == 0) 
        {
            System.out.println(currentPermutation);
            return;
        }

        // Recursive step: Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i); // Get the current character
            // Build the remaining string by excluding the current character
            String remainingStr = str.substring(0, i) + str.substring(i + 1);
            // Recursively call with the remaining string and updated permutation
            printPermutations(remainingStr, currentPermutation + ch);
        }
    }

    public static void main(String[] args) 
    {
        String input = "ABC";
        printPermutations(input, ""); // Start with an empty current permutation
    }
}