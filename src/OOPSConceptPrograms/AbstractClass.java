package OOPSConceptPrograms;


//Abstract class
abstract class Politician 
{
	// Abstract method (no body)
	public abstract void DontCare();

	// Regular method
	public void Care() 
	{
		System.out.println("Care for People.");
	}
}

//Concrete subclass
class MLA extends Politician {
	// Implement abstract method
	public void DontCare() {
     System.out.println("Don't Care for People After Election");
	}
}

public class AbstractClass {

	public static void main(String[] args)
	{
		Politician a = new MLA();
        a.Care();  
        a.DontCare();  
	}
}
