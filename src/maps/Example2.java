package maps;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
	
	public static Map<String, String> country(String name, String country){
		Map<String, String> myMap=new HashMap<>();
		if(!myMap.containsKey(name)) {
			myMap.put(name, country);
			System.out.println(name+" is good person from "+myMap.get(name));
		}
		return myMap;
	}
	
	public static void main(String[] args) {

		Map<String, String> store=new HashMap<>();
		store.putAll(country("John", "Denmark"));
		store.putAll(country("Aidina", "KG"));
		store.putAll(country("John", "Japan"));
		store.putAll(country("Brian", "Taiwan"));
		store.putAll(country("Gulya", "AZ"));
		store.putAll(country("Petro", "Ru"));
		System.out.println(store);
		
//		for(String key: store.keySet()) {
//			String nn=store.get(key);
//			System.out.println(nn);
//		}

	
	}
}
