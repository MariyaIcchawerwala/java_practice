import java.util.*;
class Neon
{
	void check(int num)
	{
		int temp,last,sum=0;
		int sqr=num*num;
		temp=sqr;
		while(temp>0)
		{
			last=temp%10;
			sum=sum+last;
			temp=temp/10;
		}
		if(sum==num)
		{
			System.out.println("it is a neon num");
		}
		else 
		{
			System.out.println("it is not a neon number");
		}

	}
	public static void main(String[] args)
	{
		Neon obj=new Neon();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		obj.check(n);
	}
}