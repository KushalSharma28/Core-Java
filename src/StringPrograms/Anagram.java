package StringPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "begin";
		String str2 = "ginfb";
		
		char s1[] = str1.toLowerCase().trim().toCharArray();
		char s2[] = str2.toLowerCase().trim().toCharArray();		
		
		if(s1.length!=s2.length)
		{
			System.out.println("Size is not match so it is not anagram");
		}
		else
		{
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			int i;
			for(i=0;i<s1.length;i++)
			{
				if(s1[i]!=s2[i])
				{
					break;
				}
			}
			
			if(i==s1.length)
			{
				System.out.println("it is anagram");
			}
			else
			{
				System.out.println("it is not anagram");
			}
		}


	}

}
