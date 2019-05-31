package maps;

import java.util.HashMap;

public class Mountains {
	public static void main(String[] args) {
		
		HashMap<String, Integer> mountains=new HashMap<>();
		mountains.put("Everest", 20098);
		mountains.put("k2", 28251);
		mountains.put("kang", 28168);
		mountains.put("Denali", 20335);
		
		printMap(mountains); // method
		
		System.out.println("Denali in the map "+mountains.containsKey("Denali"));
		System.out.println();
		System.out.println("Changing height of Denali");
		mountains.put("Denali", 20320);
		
		printMap(mountains);
		
		System.out.println("Removing kang");
		mountains.remove("kang");
		
		printMap(mountains);
		
	}
	
	public static void printMap(HashMap<String, Integer> map) {
		System.out.println("Map contains ");
		for(String key: map.keySet()) {
			Integer height=map.get(key);
			System.out.println(key+"--> "+height.intValue()+" feet. ");
		}
		System.out.println();
	}
}
