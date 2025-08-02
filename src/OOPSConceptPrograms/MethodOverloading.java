package OOPSConceptPrograms;

public class MethodOverloading 
{
	// Method to add two integers
    public int add(int a, int b) 
    {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) 
    {
        return a + b + c;
    }

    // Overloaded method to add two double numbers
    public double add(double a, double b) 
    {
        return a + b;
    }
	public static void main(String[] args) 
	{
		MethodOverloading calc = new MethodOverloading();

        System.out.println("add(2, 3) = " + calc.add(2, 3));               // Calls the first method
        System.out.println("add(2, 3, 4) = " + calc.add(2, 3, 4));         // Calls the second method
        System.out.println("add(2.5, 3.7) = " + calc.add(2.5, 3.7));       // Calls the third method
	}

}
