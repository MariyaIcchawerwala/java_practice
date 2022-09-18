import java.util.*;
class Stock
{
	static int a,b;
	static int profit(int[] prices,int a,int b)
	{
		int profit=0,sub=0;
		int i,j;
		for( i=0;i<prices.length-1;i++)
		{
			for(j=i+1;j<prices.length-1;j++)
				{
					if(prices[j]>prices[i])
					{
						sub=prices[j]-prices[i];
						if(sub>profit)
						{
							profit=sub;
							 a=i;
							 b=j;
						}
					}
				}
		}
        return profit;
	}
	public static void main(String[] args)
	{
		int l=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of days:");
		int num=sc.nextInt();
		System.out.println("enter prices of stock for the days respectively:");
		int[] prices=new int[num];
		for(int k=0;k<num;k++)
		{
			prices[k]=sc.nextInt();
			int n=prices[k];
			l=k+1;
			System.out.println("day :"+l+"| price: "+n);
		}
		int profit=profit(prices,a,b);
		if(profit==0)
		{
			System.out.println("no transactions can be done and no profit gained");
		}
		else 
		{
			System.out.println("stock should be bought on "+a+"th day and sell it on "+b+"th  day for maximum profit of:"+profit);
		}

	}
}