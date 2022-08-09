import java.util.*;
class SortArray
{
	static void sortA(int[] arr)
	{
		int c;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
					if(arr[i]>arr[j])
					{
						c=arr[i];
						arr[i]=arr[j];
						arr[j]=c;
					}
				}
			}
			System.out.println("your sorted array in ascending order is:");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter elements of array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sortA(arr);
	}

}