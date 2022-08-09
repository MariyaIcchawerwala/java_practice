import java.util.*;
class LinearSearch
{
	static void search(int[] arr,int num)
	{
		boolean b= false;
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				a=i;
				b=true;
				break;
			}
		}
		if(b==true)
		{
			System.out.println("your searched element "+num+" is at "+a+"th position");
		}
		else 
		{
			System.out.println("your element does not exist in the array");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter elements of array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter number you want to search");
		int num=sc.nextInt();
		search(a,num);
	}
}