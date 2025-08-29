package InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatativeCharacter 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Character= ");
		String str=scan.nextLine();
		scan.close();
		//String str = "swiss";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : str.toCharArray())
		{
		    map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (char c : map.keySet()) 
		{
		    if (map.get(c) == 1) 
		    {
		        System.out.println("First non-repeated: " + c);
		        break;
		    }
		}
	}
}
