package ArraysPrograms;

public class MaxArrays {

	public static void main(String[] args) {
		int a[] = {23,4,7,8,5,5,54,110,89,54,35,43,43,22,32,32,6,4,33,45,6,8,8};
		
		int max= Integer.MIN_VALUE;
		int secmax = a[0];
		int thirdmax = a[1];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax = max;
				max = a[i];
			}
			else if(a[i]>secmax && a[i]!=max)
			{
				thirdmax = secmax;
				secmax = a[i]; 
			}
			else if(a[i] >thirdmax && a[i]!= max && a[i]!=secmax )
			{
				int temp = thirdmax;
				thirdmax = a[i];
				a[i] = temp;
			}
		}
		System.out.println(max);
		System.out.println(secmax);
		System.out.println(thirdmax);

	}

}
