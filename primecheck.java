import java.util.*;
class Primecheck
{
	int primeno()
	{   int flag=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to be checked");
		int n=sc.nextInt();
		if(n==2||n==3||n==5||n==7)
		{
			flag=1;
		}
		else
		{
			for(int i=2;i<=10;i++)
			{
				if(n%i==0)
				{
					flag=0;
					break;
				}
			}
		}
		return flag;
	}
      public static void main(String[] args) 
	 {
		Primecheck obj = new Primecheck();
	      int flag=obj.primeno();
	     if(flag==1)
	     {
	     	System.out.println("number is prime");
	     }
	     else 
	    {
	    	System.out.println("number is not prime");
	    }

	 }
	}
    








	
