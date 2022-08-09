import java.util.*;
class Duck
{
	static boolean check(String str)
	{
		boolean b=true;
		if(str.charAt(0)=='0')
		{
			b=false;
		}
		else 
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='0')
				{
					b=true;
					break;
				}
			}
		}
		return b;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		String s1=sc.nextLine();
		boolean b=check(s1);
		if(b==true)
		{
			System.out.println("it is a duck number");
		}
		else 
		{
			System.out.println("not a duck number");
		}
	}
}