import java.util.*;
class Strvowel
{
	static void count(String s)
	{
		s=s.replaceAll(" ","");
		int count1=0,count2=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count1++;
			}
			else 
			{
				count2++;
			}
		}
		System.out.println("number of vowels are:"+count1);
		System.out.println("number of consonants are:"+count2);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you string:");
		String str=sc.nextLine();
		count(str);
	}
}