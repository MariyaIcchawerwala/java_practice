class Practice2 extends Thread
{
	public void run()
	{
		Thread.yield(); 
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args)
	{
		Practice2 p=new Practice2();
	
		p.start();
	
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}