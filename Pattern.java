import java.util.*;
class Pattern
{
	static void print(int rows)
	{
		for(int i=rows;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int rows=sc.nextInt();
		print(rows);
	}
}