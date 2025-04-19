package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ALExtractPortion {

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
        ls.add("Red");
        ls.add("Green");
        ls.add("Orange");
        ls.add("White");
        ls.add("Black");
        System.out.println("Original list: " + ls);
        List<String> sub_List = ls.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);

	}

}
