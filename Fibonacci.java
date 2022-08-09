class Fibonacci
{
	void series()
	{
	int a=0;
	int b=1;
	System.out.println("Fibonacci series is:");
	System.out.println(a);
	System.out.println(b);
	for(int i=0;i<15;i++)
	{
		int c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
}
	public static void main(String[] args)
	{
		Fibonacci obj=new Fibonacci();
		obj.series();

	}
}


