package StringPrograms;

public class AllSubset {

	public static void main(String[] args) {
		String str="Hello World";
		int len=str.length();
		int n=(len*(len+1)/2);
		String a[]=new String[n];
		int temp=0;
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				String b=str.substring(i,j+1);
				a[temp]=b;
				temp++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
