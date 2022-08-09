import java.util.*;
class Sunny
{
	public static void main(String[] args)
	{
		int n,c,s,num,last;
		Scanner sc = new Scanner (System.in);
	    System.out.println("enter the number to be checked:");
	    n = sc.nextInt();
	    num=n+1;
		s = (int)Math.sqrt(num);
		c=s*10;
		last=c%10;
		if(last==0)
		{
			System.out.println("number is a sunny number");
		}
		else 
		{
			System.out.println("it is not a sunny number");
		}

	}
}