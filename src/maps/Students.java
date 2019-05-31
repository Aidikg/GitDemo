package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Students {
	public static void main(String[] args) {
		
//		HashMap<String, String> newMap = new HashMap<String, String>();
//		newMap.put("my_code", "shhh_secret");
//		String value = newMap.get("my_code");
//		System.out.println(value);
		
		
		String str="Kkuuuuuurmanbekova";
		Map<Character, Integer> name=new LinkedHashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			if(!name.containsKey(str.charAt(i))) {
				name.put(str.charAt(i), 1);
			}
			else {
				name.put(str.charAt(i), name.get(str.charAt(i))+1);
			}
		}
		System.out.println(name);
		
		
		
	
//		Map<String, String> students=new HashMap<>();
//		students.put("Medet", "kind");
//		students.put("Kyial", "honest");
//		students.put("Bek", "smart");
////		System.out.println(students);
//		
//		// my map_variable call :  students
//		
//		
//		students.put("Aidina", "smart");
//		students.put("Chynar","beautifull");
//		students.putIfAbsent("Tancho", "kind");
//		System.out.println(students);
//		
//		Map<String, String> names=new HashMap<>();
//		names.putAll(students);
		
		
	}
}
