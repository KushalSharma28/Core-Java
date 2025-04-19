package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ALUpdateElement {

	public static void main(String[] args) {
		// Creae a list and add some colors to the list
        List<String> ls = new ArrayList<String>();
        ls.add("Red");
        ls.add("Green");
        ls.add("Orange");
        ls.add("White");
        ls.add("Black");
        // Print the list
        System.out.println(ls);
        // Update the third element with "Yellow"
        ls.set(2, "Yellow");
        // Print the list again
        System.out.println(ls);
	}

}
