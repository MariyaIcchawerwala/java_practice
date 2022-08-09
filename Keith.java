import java.util.*;
class Keith
{
	int last,temp,count=0;
	int count(int num)//this function is for counting 
	{
		temp=num;
		while(temp>0)
		{
			last=temp%10;
			count++;
			temp=temp/10;
		}
		return count;
	}
	void check(int num)//this funtion is to check whether the number is keith
	{
		int c=count(num);
		int d=0;
		temp=num;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;temp>0;i++)
		{
			last=temp%10;
			arr.add(last);
			temp=temp/10;
		}
		Collections.reverse(arr);
		for(int i=0;d<num;i++)
		{   
			d=0;
            int count=c;
			for(int j=arr.size()-1;count>=1;j--)
			{
				d=d+arr.get(j);
				count--;
			}
			arr.add(d);
		}
		if(d==num)
		{
			System.out.println("this is a keith number");
		}
		else 
		{
			System.out.println("it is not a keith number");
		}
	}
	public static void main(String[] args)
	{
		Keith k=new Keith();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		k.check(num);
	}
}