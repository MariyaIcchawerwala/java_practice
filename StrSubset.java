import java.util.*;
class StrSubset
{
	static void set(String s)
	{
		String sub="";
		System.out.println("subset for the given string is:");
		for(int i=0;i<s.length();i++)
		{
			sub="";
			for(int j=i;j<s.length();j++)
			{
				sub=sub+s.charAt(j);
				System.out.println(sub);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		set(s1);
	}
}