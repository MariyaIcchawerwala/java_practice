import java.util.*;
class LeftRotate
{
	static void rotate(int[] arr)
	{
		int n=arr.length;
		System.out.println("your array before rotating:");
		for(int i=0;i<n-1;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("array after rotating");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		System.out.println("enter elements");
		int[] arr=new int[size];
		for(int i=0;i<=size-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		rotate(arr);
	}
}