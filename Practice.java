class Practice extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		Thread mainThread=Thread.currentThread();
		System.out.println(Thread.currentThread().getName());
		Practice p=new Practice();
		p.setName("mariya");
		p.start();
		mainThread.setName("main1");
		System.out.println(Thread.currentThread().getName());
	}
}