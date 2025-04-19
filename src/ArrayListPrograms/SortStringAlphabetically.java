package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringAlphabetically {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

        list.add("white");
        list.add("Orange");
        list.add("White");
        list.add("Red");

        Collections.sort(list);

        System.out.println("Sorted list: " + list);

	}

}
