import java.util.*;
class Leapyear
{
	void calculate()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter year to be checked");
		int n = sc.nextInt();
		if((n%4==0)&&(n%100!=0)||(n%400==0))
		{
			System.out.println("year is a Leapyear");
		}
		else 
		{
			System.out.println("year is a non leapyear");
		}
	}
	public static void main(String args[])
	{
		Leapyear obj = new Leapyear();
		obj.calculate();
	}



}