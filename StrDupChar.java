import java.util.*;
class StrDupChar
{
	static void check(String str)
	{
		ArrayList<Character> arr=new ArrayList<Character>();
		str=str.replaceAll(" ","");
		for(int i=0;i<str.length();i++)
		{
			if(arr.contains(str.charAt(i)))
			{
				continue;
			}
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					arr.add(str.charAt(i));
					break;
				}
			}
		}
		System.out.println(arr);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String str=sc.nextLine();
		check(str);
	}
}