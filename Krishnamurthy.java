import java.util.*;
class Krishnamurthy
{
	static void check(int num)
	{
		int temp,last;
	    int product,sum=0;
		temp=num;
		while(temp!=0)
		{
			last=temp%10;
			System.out.println(last);
			product=1;
			for(int i=last;i>=1;i--)
			{
				product=product*i;
			}
			temp=temp/10;
			sum=sum+product;
		}
		if(sum==num)
		{
			System.out.println("its a krishnamurthy number");
		}
		else 
		{
			System.out.println("it is not a Krishnamurthy number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		check(num);
	}
}