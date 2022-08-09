import java.util.*;
class CopyArr
{
	static void copy(int[] arr)
	{
		int i=0;
		int n=arr.length;
		int[] copy=new int[n];
		System.out.println("copied elements of array are:");
		for(int e:arr)
		{
			copy[i]=e;
			i++;
		}
		for(int j=0;j<n;j++)
		{
		System.out.println(arr[j]);
	}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter elements of array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		copy(arr);
	}
}