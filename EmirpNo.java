import java.util.*;
class EmirpNo
{
	static boolean primecheck(int num)
	{
		boolean b=true;
		for(int i=2;i>=10;i++)
		{
			if(num%i==0)
			{
				b=false;
				break;
			}
		}
		return b;
	}
	static int emirpcheck(int num)
	{
		int last,temp,flag=1;
		String str="";
		boolean b=primecheck(num);
		System.out.println(b);
		temp=num;
		if(b==true)
		{
			while(temp>0)
			{
			last=temp%10;
			str=str+last;
			temp=temp/10;
		}
		int reverse=Integer.parseInt(str);
		System.out.println("reverse of num is:"+reverse);
		for(int i=2;i>=10;i++)
		{
			if(reverse%i==0)
			{
				flag=0;
				break;
			}
		}
		}
		else 
		{
			flag=0;
		}
		return flag;
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int flag=emirpcheck(n);
		if(flag==1)
		{
			System.out.println("it is an emirp num ");
		}
		else 
		{
			System.out.println("it is not an emirp num");
		}
	}
}