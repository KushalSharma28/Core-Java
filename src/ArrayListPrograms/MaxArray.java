package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class MaxArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(20);

        int max = Collections.max(list);

        System.out.println("Maximum element: " + max);

	}

}
