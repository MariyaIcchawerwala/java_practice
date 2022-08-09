import java.util.*;
class Evil
{
	static int temp,c;
	static int check(int num)
	{
		int count=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		temp=num;
		while(temp!=0)
		{
			if(temp==1)
			{
				arr.add(1);
				break;
			}
			else 
			{
				c=temp%2;
				arr.add(c);
				temp=temp/2;
			}
		}
		System.out.println("binary form of "+num+" is:"+arr);
		for(int i=0;i<arr.size();i++)
		{
			int s=arr.get(i);
			if(s==1)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to be checked:");
		int num1=sc.nextInt();
		int count1=check(num1);
		if(count1%2==0)
		{
			System.out.println("number is an evil num as it has even num of 1s");
		}
		else 
		{
			System.out.println("number is an odious num because its binary equivalent doest not have even num of 1s");
		}
	}
}