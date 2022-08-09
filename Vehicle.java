class Vehicle
{
	void run()
	{
		System.out.println("vehicle is running");
	}

}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println("bike is starting");
	}
}
class Main
{
	public static void main(String[] args)
	{
		Bike obj =new Bike();
		obj.run();
		obj.start();
	}
}