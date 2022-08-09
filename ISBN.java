import java.util.*;
class Isbn
{
	static void check(String str)
	{
		int sum=0;
		int a;
		int product=1;
		int n=str.length();
		int j=1;
		for(int i=n-1;i>=0;i--)
		{

			a=Character.getNumericValue(str.charAt(i));
			product=a*j;
			j++;
			sum=sum+product;
		}
		System.out.println(sum);
		if(sum%11==0)
		{
			System.out.println("it is a legal isbn number");
		}
		else 
		{
			System.out.println("it is not a legal isbn number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 digit number to be checked");
		String str=sc.nextLine();
		check(str);
	}
}