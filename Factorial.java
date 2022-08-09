import java.util.*;
class Factorial
{
	public static void main(String[] args)
	{
		int mult=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=n;n>=1;n--)
		{
			mult=mult*n;
		}
		System.out.println("Factorial of number is:"+mult);
	}
}