package ArraysPrograms;

public class MinArrays {

	public static void main(String[] args) {
		int a[] = {12,23,34,45,56,67,78,89,90,21,87,76,65,54,43,43,32,21,11};
		
		int min = Integer.MAX_VALUE;
		int secmin = a[0];
		int thirdmin = a[1];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]< min)
			{
				secmin = min;
				min = a[i];
			}
			else if(a[i]<secmin && a[i]!=min)
			{
				thirdmin = secmin;
				secmin = a[i];
			}
			else if(a[i]<thirdmin && a[i]!=min && a[i]!=secmin)
			{
				int temp = thirdmin;
				thirdmin = a[i];
				a[i] = temp;
			}
		}
		
		System.out.println(min);
		System.out.println(secmin);
		System.out.println(thirdmin);

	}

}
