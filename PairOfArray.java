import java.util.*;
class PairOfArray
{
	public static void checkSum(int[] arr, int num)
	{
		boolean b=false;
		int c=0;
		int[] arr2=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				c=arr[i]+arr[j];
				if(c==num)
				{
                   arr2[0]=arr[i];
                   arr2[1]=arr[j];
                   b=true;
                   break;
				}
			}
		}
		if(b==true)
		{
           System.out.println("your pair of arrray which reprents your sum "+num+" is:");
           System.out.println(Arrays.toString(arr2));
		}
		else 
		{
			System.out.println("there is no such pair present");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of your array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter elements for your array");
		for(int i=0;i<size;i++)
		{
           arr[i]=sc.nextInt();
		}
		System.out.println("enter sum you want to find in pair");
		int sum=sc.nextInt();
		checkSum(arr,sum);

	}
}