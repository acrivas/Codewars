package listFiltering;

import java.util.ArrayList;
import java.util.List;

public class Kata {

	public static void main(String[] args) {
		
		List<Object> list = List.of(1, 2, "a", "b");
		List<Object> outputList = new ArrayList();
		System.out.println(list);
		outputList = filterList(list);
		System.out.println(outputList);
		
	}
	
	public static List<Object> filterList(final List<Object> list) {
		ArrayList outputList = new ArrayList();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Integer) {
				outputList.add(list.get(i));
			}
		}
		return outputList;
	}

}
