package OOPSConceptPrograms;

class Employee
{
    private int id;
    private String name;

    public Employee(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        if (id>0) {
            this.id = id;
        }
    }
    // Getter and Setter for name
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
}

public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Employee emp = new Employee(1, "Siemens");

        // Access via getters/setters only, direct field access not allowed:
        System.out.println(emp.getName());  // Siemens
        emp.setName("Siemens AG");
        System.out.println(emp.getName());  // Siemens AG

	}

}
