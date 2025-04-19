package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ALSearchElement {

	public static void main(String[] args) {
		// Creae a list and add some colors to the list
        List<String> ls = new ArrayList<String>();
        ls.add("Red");
        ls.add("Green");
        ls.add("Orange");
        ls.add("White");
        ls.add("Black");
        // Search the value Red
        if (ls.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

	}

}
