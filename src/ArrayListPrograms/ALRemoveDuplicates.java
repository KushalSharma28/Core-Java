package ArrayListPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ALRemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(15);
        l1.add(16);
        l1.add(15);
        Set<Integer> set = new HashSet<>(l1);
        l1.clear();
        l1.addAll(set);
        System.out.println("ArrayList after removing duplicates: " + l1);

	}

}
