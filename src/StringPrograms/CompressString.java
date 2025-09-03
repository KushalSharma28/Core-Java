package StringPrograms;

public class CompressString {
	
	public static String compressString(String s) 
	{
        // if (s == null || s.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) 
        {
            if (s.charAt(i) == s.charAt(i - 1)) 
            {
                count++;
            } 
            else 
            {
                result.append(s.charAt(i - 1));
                
                if (count > 1) result.append(count);
                count = 1;
            }
        }

        result.append(s.charAt(s.length() - 1));
        if (count > 1) 
        	result.append(count);

        return result.toString();
    }

	public static void main(String[] args) 
	{
		System.out.println(compressString("AABBBCCCCaaaaa"));
	}

}
