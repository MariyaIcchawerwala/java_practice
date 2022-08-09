import java.util.*;
class Largest2nd
{
	static void check(int[] a)
	{
		int largest=0,scndlargest=0;
		for(int i=0;i<a.length;i++)
		{
			if(largest<a[i])
			{
				largest=a[i];
			}
		}
		//checking for second largest
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==largest)
			{
				continue;
			}
			else 
			{
				if(scndlargest<a[i])
				{
					scndlargest=a[i];
				}
			}
		}
		System.out.println("second largest element of your array is:"+scndlargest);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of your array:");
		int n=sc.nextInt();
		System.out.println("enter elements of array");
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		check(arr);

	}
}