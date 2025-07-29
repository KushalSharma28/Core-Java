package OOPSConceptPrograms;

//Abstract class
abstract class Vehicle 
{
	abstract void startEngine();

	public void stopEngine() 
	{
     System.out.println("Engine stopped.");
	}
}

class Car extends Vehicle 
{
	@Override
	void startEngine() 
	{
     System.out.println("Car engine started.");
	}
}

public class Abstraction 
{

	public static void main(String[] args) 
	{
		Vehicle myCar = new Car();
        myCar.startEngine(); // Car engine started.
        myCar.stopEngine();  // Engine stopped.
	}
}
