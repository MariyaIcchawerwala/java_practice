import java.util.*;
class StrDevide
{
	static void check(String s,int n)
	{
		int length=s.length();
		int a=0;
		int dev=length/n;
		if(length%n==0)
		{
			System.out.println("result after deviding string into"+n+"parts is:");
			for(int i=dev;i<=length;i=i+dev)
			{
				String temp=s.substring(a,i);
				System.out.println(temp);
				a=i;
			}
		}
		else 
		{
			System.out.println("given string cannot be devided into"+n+"equal parts");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string of your choice:");
		String s=sc.nextLine();
		System.out.println("in how many parts you want to devide the string?");
		int n=sc.nextInt();
		check(s,n);
	}
}