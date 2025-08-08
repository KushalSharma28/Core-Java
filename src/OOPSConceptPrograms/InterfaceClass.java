package OOPSConceptPrograms;

//Define the interface
interface RichPerson 
{
	void spendMoney();
	void ownLuxury();
}

//Implementing the interface
class Billionaire implements RichPerson 
{
	public void spendMoney() 
	{
		System.out.println("Spends money on yachts and private jets.");
	}

	public void ownLuxury() 
	{
		System.out.println("Owns mansions around the world.");
	}
}
public class InterfaceClass 
{
	public static void main(String[] args) 
	{
		RichPerson person = new Billionaire();
        person.spendMoney();  
        person.ownLuxury();   
	}

}
