package StringPrograms;

public class CharCount {

	public static void main(String[] args) {
		String str = "Eclipse";
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			//if(str.charAt(i)!= ' ')
			//{
				count++;
			//}
		}
		System.out.println( "Total char are present in String is :"+ count);
	}

}
