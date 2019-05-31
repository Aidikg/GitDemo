package setListMap;

import java.util.ArrayList;

public class ExList {
	public static void main(String[] args) {
		ArrayList<String> people=new ArrayList<>();
		people.add("Tom");
		people.add("Alice");
		people.add("Kate");
		people.add("Sam");
		
		System.out.println("Geting second element: "+ people.get(1));
		people.set(1, "Robert");
		System.out.println("List has # of elements size "+people.size());
		
		for(String p: people) {
			System.out.println(p);
		}
		
		if(people.contains("Tom")) {
			System.out.println("ArrayList contains Tom");
		}
	}
}
