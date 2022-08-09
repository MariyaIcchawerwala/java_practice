import java.util.*;
class Sphenic2
{
	static void check(int num)
	{
		int count=1;
		int product=1;
		boolean b=true;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=2;count<=3;i++)
		{
		System.out.println("least three prime factors of num are:");
			for(int j=2;j<=10;j++)
			{
				if(i==j)
				{
		System.out.println("if(i==j):"+i+j);
					continue;
				}
				else 
				{
		System.out.println("else");
					if(i%j==0)
					{		System.out.println("if(i%j==0):");
						b=false;
						break;
					}
				}
			}
			if(b==true)
			{
		System.out.println("least three prime factors of num are:");
				if(num%i==0)
				{
					arr.add(i);
					count++;
				}
			}
		}
		System.out.println("least three prime factors of num are:");
		System.out.println(arr);
		for(int k=0;k<arr.size();k++)
		{
			product=product*arr.get(k);
		}
		if(num==product)
		{
			System.out.println("it is a sphenic number");
		}
		else 
		{
			System.out.println("its not a sphrnic number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		check(num);
	}



}