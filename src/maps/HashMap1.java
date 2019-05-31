package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
	
		// Example 2
		// Map just takes objects
		Map<String, Integer> grocery=new HashMap<>();
		grocery.put("orange", 3);
		grocery.put("apple", 5);
		grocery.put("milk", 2);
		grocery.put("egg", 2);
		grocery.put("ananas", 5);
		grocery.put("pear", 10);
		grocery.put("juice", 28);
		grocery.put("bread", 3);
		grocery.put("mango", 16);
		grocery.put("tomatoes", 5);
		
		System.out.println(grocery);
		grocery.remove("orange");
		System.out.println(grocery);
		System.out.println(grocery.keySet());
		System.out.println(grocery.values());
		System.out.println(grocery.entrySet());
	//	System.out.println("I didnt find "+grocery.entrySet()+ " , will buy next time");
		
		
		
		
		
		
		
		
		
		// Example 1
//		Map<String, String> mapOfStr=new HashMap<>();
//		mapOfStr.put("Bek", "Student");
//		mapOfStr.put("Tolgonai", "Student");
//		mapOfStr.put("Arslan","Mentor");
//		mapOfStr.put("Bek", "Teacher"); // Overriden the existing value
//		mapOfStr.put("Tima", null);
//		mapOfStr.put("Medet", null);
//		mapOfStr.put("Tancho", null);
//		mapOfStr.put(null, "Kyial");
//		mapOfStr.put(null, "Nuri");
//		System.out.println(mapOfStr);
//		System.out.println(mapOfStr.get("Arslan"));
		
	}
}
