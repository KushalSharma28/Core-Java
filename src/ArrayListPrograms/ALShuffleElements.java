package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ALShuffleElements {

	public static void main(String[] args) {
		// Creae a list and add some colors to the list
        List<String> ls = new ArrayList<String>();
        ls.add("Red");
        ls.add("Green");
        ls.add("Orange");
        ls.add("White");
        ls.add("Black");

        System.out.println("List before shuffling:\n" + ls);

        Collections.shuffle(ls);

        System.out.println("List after shuffling:\n" + ls);

	}

}
