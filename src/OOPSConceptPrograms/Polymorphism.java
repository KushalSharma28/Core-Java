package OOPSConceptPrograms;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class Polymorphism 
{

	public static void main(String[] args) 
	{
		Shape shape = new Circle();
        shape.draw();  // Drawing circle

	}

}
