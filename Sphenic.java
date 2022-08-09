import java.util.*;
class Sphenic
{
	static void check(int num)
	{
		int count=0;
		int product=1;
		boolean b=true;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=2;count<=3;i++)
		  {
		  	/*System.out.println(count);*/
	
			   if(num%i==0)
			   {
			   	System.out.println(num);
				  for(int j=2;j<=10;j++)
					{
						if(i!=j)
						{
							if(i%j==0)
							{
								b=false;
								break;
							}
						}
					}
					System.out.println(i);
					System.out.println(b);
					if(b==true)
					{
						arr.add(i);
						count++;
					}
				}
		
		}
		System.out.println("this is least three prime number");
		System.out.println(arr);
		for(int i=0;i<=arr.size();i++)
		{
			product=product*arr.get(i);
		}
		System.out.println("product of least three prime number is"+product);
		if(product==num)
		{
			System.out.println("it is a sphenic number");
		}
		else 
		{
			System.out.println("it is not a sphenic number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to be checked");
		int num=sc.nextInt();
		check(num);
	}
}