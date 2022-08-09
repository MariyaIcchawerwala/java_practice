import java.util.*;
class DoubleArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter elements of array:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int c=doublecheck(arr);
		if(c==0)
		{
			System.out.println("there are no duplicate elements");
		}
	}
	static int doublecheck(int[] arr)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(a.contains(arr[i]))
				{
					break;
				}
				else 
				{
					if(i==j)
					{
						continue;
					}
					else 
					{
						if(arr[i]==arr[j])
						{
							a.add(arr[i]);
						}
					}
				}
			}
		}
		int c=a.size();
		System.out.println(a);
		return c;
	}
}