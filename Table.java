import java.util.*;
class Table 
{
	void calculate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number of your choice");
		int n = sc.nextInt();
		System.out.println("Table of number is:");
		for(int i=1;i<=10;i++)
		{
			int t = n*i;
			System.out.println(t);
		}
	}
	public static void main(String[] args)
	{
		Table obj = new Table();
		obj.calculate();
	}

}