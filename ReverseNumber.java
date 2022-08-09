import java.util.*;
class ReverseNumber
{
	void reverse(int n)
	{
		int temp,l;
		String str="";
		temp=n;
		while(temp>0)
		{
			l=temp%10;
			str=str+l;
			temp=temp/10;
		}
		System.out.println("your reversed number is:"+str);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to be reversed");
		int n =sc.nextInt();
		ReverseNumber obj=new ReverseNumber();
		obj.reverse(n);

	}
}