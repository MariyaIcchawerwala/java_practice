import java.util.*;
class Automorphic
{
	int temp;
	int last;
		Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
		int s=n*n;
	int digit()
	{
		temp=s;
		int digit=0;
		while(temp>0)
		{
			last=temp%10;
			digit++;
			temp=temp/10;
		}
		return digit;
	}
	void check()
	{
		int modulus;
		int c=digit();
		switch(c)
		{

		case 2 : last=s%10;
			     break;
		case 3 : last=s%100;
			     break;
		case 4 : modulus=s%1000;
			     last=modulus%100;
			     break;
		}
		System.out.println("last:" +last);
		if(last==n)
		{
			System.out.println("it is an automorphic digit");
		}
		else 
		{
			System.out.println("it is not an automorphic number");
		}


	}
	public static void main(String[] args)
	{
		Automorphic obj = new Automorphic();
		obj.check();
	}


}