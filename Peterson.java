import java.util.*;
class Peterson
{
	public static void main(String[] args)
	{
		int temp,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to be checked:");
		int n = sc.nextInt();
		temp=n;
		while(temp>0)
		{
			int l = temp%10;
			System.out.println(l);
			sum=sum+fact(l);
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println("entered number is a peterson number");
		}
		else
		{
			System.out.println("entered number is not a peterson number");
		}

	}
	static int fact(int l)
	{
		int fact=1;
		{
		for(int i=l;l>=1;l--)
			{
				fact = fact*l;
				

			}
			return fact;
		}
	}
}