package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InClass {
	public static void main(String[] args) {
		
		// Converting Array to ArrayList
		String[] city= {"town", "Street"};
		List<String> city1=Arrays.asList(city);
		System.out.println(city1.size());
//		city1.add("suburb");
//		city1.remove(0);
		city1.set(0, "suburb");
		System.out.println(city1);
		
		
		// Converting ArrayList to Array
//		List<String> meal=new ArrayList<>(19);
//		System.out.println(meal.size());
//		meal.add("Beef Bowl");
//		meal.add(1, "Checken soup");
//		System.out.println(meal+" It is ArrayList");
//	//	System.out.println(meal[0]);  // You cannot to do this because it is ArrayList
//		
//	//	Object[] rest=meal.toArray();
//		String[] rest=meal.toArray(new String[0]);
//		System.out.println(Arrays.toString(rest)+" It is Array");
//		System.out.println(rest[0]);
		
		
		// Primitive D T && Wrapper class -> converting
//		int primitive =Integer.parseInt("123");
//		System.out.println(primitive+10);
//		
//		Integer wrapper=Integer.valueOf("890");
//		System.out.println(wrapper+10+10);
	
		// it will NOT compile
//		List<> items=new ArrayList<>();
//		items.add("apple");
//		items.add(1, "banana");
//		items.add(0, "orange");
//		items.add(1, "strawberry");

	}
}
