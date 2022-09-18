import java.util.*;
class Pattern2
{
	public static void print(int rows)
	{
		System.out.println("here is your pattern");
		for(int i=1;i<=rows;i++)
		{
            for(int j=1;j<=i;j++)
            {
            	System.out.print(j);
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