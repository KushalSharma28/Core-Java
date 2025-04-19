package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ALSort {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("C#");

        //list.remove(String.valueOf("C#"));
        //Collections.sort(list);
        list.sort(null);
        System.out.println(list);

	}

}
