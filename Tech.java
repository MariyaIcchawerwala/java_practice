import java.util.*;
class Tech
{
	static int count(int n)
	{
		int temp,count=0,last;
		temp=n;
		while(temp>0)
		{
			last=temp%10;
			count++;
			temp=temp/10;
		}
		return count;
	}
	public static void main(String[] args)
	{
		int last,first,c,s,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to be checked");
	    int n=sc.nextInt();
	    c=count(n);
		s=c/2;
		d=(int)Math.pow(10,s);
		first=n/d;
		int m=first*d;
		last=n-m;
		int add= first+last;
		int num=add*add;
		if(num==n)
		{
			System.out.println("it is a tech num");
		}
		else 
		{
			System.out.println("it is a non tech num");
		}
	
	}
}