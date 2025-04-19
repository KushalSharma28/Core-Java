package PracticePrograms;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> Linkedlist = new LinkedList<>();


        // Adding elements to the LinkedList
		Linkedlist.add(5);
		Linkedlist.add(10);
		Linkedlist.add(15);
        
        System.out.println("The initial LinkedList");
        System.out.println("LinkedList:"+ Linkedlist +"\n");
        System.out.println("Size of the LinkedList: " + Linkedlist.size()+"\n");
        
        System.out.println("Iterating over the LinkedList\n");
        
        for (int value : Linkedlist) {

            System.out.println("Element->" + value);

        }
        System.out.println("\n");
        
        // Modifying the element 
        Linkedlist.set(0,8);
        
       // Accessing the element
       System.out.println("Number at 1 position is " + Linkedlist.get(1));
        
        // Removing the element 
       Linkedlist.remove(2);
        System.out.println("Third element removed\n");
        
        System.out.println("The final LinkedList");
        
        // Printing the final LinkedList
        System.out.println("LinkedList:"+Linkedlist+"\n");
        System.out.println("Size of the LinkedList: " + Linkedlist.size());

	}

}
