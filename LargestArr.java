import java.util.*;
class LargestArr
{
	static void checkLargest(int[] arr)
	{
		int largest=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			else 
			{
				continue;
			}
		}
		System.out.println("Largest number in your array is:"+largest);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter elements of array");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		checkLargest(a);
	}
}