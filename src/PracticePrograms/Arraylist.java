package PracticePrograms;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args)
	{
		ArrayList<Integer> Arraylist = new ArrayList<Integer>();
		
		Arraylist.add(5);
		Arraylist.add(10);
		Arraylist.add(15);
		
		System.out.println("Array List:"+ Arraylist +"\n");
		System.out.print("size of array list" + Arraylist.size());
		
		for(int i=0;i<= Arraylist.size();i++)
		{
			System.out.println("Number at index " + i + " is " + Arraylist.get(i));
		}
		
		Arraylist.set(0,3);
        
        // Accessing the element
		System.out.println("Number at index 1 " + Arraylist.get(1)+"\n");
        
        // Removing the element 
        Arraylist.remove(2);
        
        System.out.println("The final ArrayList");
        
        //Printing the final ArrayList
        System.out.println("Array List:"+Arraylist+"\n");
        System.out.println("Size of the ArrayList: " + Arraylist.size());
	}
}
