import java.util.*;
class ArrayFreq
{
	static void check(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int a:arr)
		{
			if(map.containsKey(a))
			{
				map.put(a,map.get(a)+1);
			}
			else 
			{
				map.put(a,1);
			}
		}
		for(Map.Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"|"+entry.getValue());
		}

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		check(arr);
	}
}