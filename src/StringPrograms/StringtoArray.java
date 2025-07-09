package StringPrograms;

public class StringtoArray {

	public static void main(String[] args) {
		String a ="My dad is Teacher";
		
		char b[] = new char[a.length()];
		
		for(int i=0;i<a.length();i++)
		{
			b[i] = a.charAt(i);
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
