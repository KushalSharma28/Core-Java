package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeNumberLists {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2,4,6,8));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,5,7));
		
		List<Integer> mergeList = new ArrayList<>();
		mergeList.addAll(list1);
		mergeList.addAll(list2);
		System.out.println(mergeList);

	}

}
