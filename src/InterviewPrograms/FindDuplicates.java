package InterviewPrograms;

public class FindDuplicates 
{
	// Helper function to print a character array
    private static void printArray(char[] array) 
    {
        for (char element : array) 
        {
            System.out.print(element + " ");
        }
        System.out.println(); // New line after printing the array
	}
	public static void main(String[] args) 
	{
		String inputString = "123";

        // Create three arrays to store the characters
        char[] array1 = new char[inputString.length()];
        char[] array2 = new char[inputString.length()];
        char[] array3 = new char[inputString.length()];

        // Populate the arrays with the characters from the string
        for (int i = 0; i < inputString.length(); i++) 
        {
            array1[i] = inputString.charAt(i);
            array2[i] = inputString.charAt(i);
            array3[i] = inputString.charAt(i);
        }

        // Print the arrays
        System.out.println("Array 1:");
        printArray(array1);

        System.out.println("\nArray 2:");
        printArray(array2);

        System.out.println("\nArray 3:");
        printArray(array3);
	}

}
