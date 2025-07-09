package ArraysPrograms;

public class EvenOddArray {

	public static void main(String[] args) {
		int a[] = {1,345,4565,34,5346,34,434,43,54,2356,35,23,42,42,42,3,45,46,56,67,8,76,8,78,55,6,6,2,47,57,56,7};

		System.out.println("even data ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}

		System.out.println();
		System.out.println("it is odd data");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.println();
		System.out.println("it is even position data");
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(a[i]+ " ");
			}
		}
		
		System.out.println();
		System.out.println("odd position data");
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}


	}

}
