import java.util.*;
class ReverseString
{
	static void reverse(String s1)
	{
		String s2="";
		char arr[]=s1.toCharArray();
		int n=arr.length;
		System.out.println(n);

		for(int i=n-1;i>=0;i--)
		{
			
			s2=s2+arr[i];

		}
		System.out.println(s2);
	    if(s1.equals(s2))
	    {
	    	System.out.println("it is a palindrom");
	    }
	    else
	    {
	    	System.out.println("strings are not palindrom");
	    }

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.nextLine();
		reverse(s1);
	}
}