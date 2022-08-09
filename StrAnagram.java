import java.util.*;
class StrAnagram
{
	static boolean check(String s1,String s2)
	{
		boolean b=true;
		if(s1.length()!=s2.length())
		{
			b=false;
		}
		else 
		{
			for(int i=0;i<s1.length();i++)
			{
				
				String a=Character.toString(s1.charAt(i));
				if(s2.contains(a))
				{
					continue;
				}
				else 
				{
					b=false;
					break;
				}
			}
		}
		return b;
	}
	public static void main(String[] args)
	{
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter first string:");
	 String s1=sc.nextLine();
	 System.out.println("enter second string:");
	 String s2=sc.nextLine();
	 boolean b=check(s1,s2);
	 if(b==true)
	 {
	 	System.out.println("Strings are anagram");
	 }
	 else 
	 {
	 	System.out.println("Strings are not anagram");
	 }
	}
}