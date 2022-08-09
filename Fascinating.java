import java.util.*;
class Fascinating
{
	int count(int n)
	{
		int last,count=0;
		int temp=n;
		while(temp>0)
		{
			last =temp%10;
			count++;
			temp=temp/10;
		}
		return count;
	}
	boolean check()
	{
		boolean b=true;
		int c,num;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nnumber to be checked");
	    num=sc.nextInt();
	    c=count(num);
	    if(c>=3)
	    {
	    	int first=num*2;
	    	int second=num*3;
	    	str=str+num+first+second;
	    	for(int i=1;i<=9;i++)
	    	{
	    		String s=Integer.toString(i);
	    	
	    	if(str.contains(s))
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
	    else 
	    {
	    	b=false;
	    }
	    return b;
	}
	public static void main(String[] args)
	{
		Fascinating obj=new Fascinating();
		boolean b=obj.check();
		if(b==true)
		{
			System.out.println("it is a Fascinating number");
		}
		else 
		{
			System.out.println("it is non fascinating number");
		}
	}
}