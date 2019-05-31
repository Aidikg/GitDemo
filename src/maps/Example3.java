package maps;

import java.util.HashMap;
import java.util.Map;

public class Example3 {
	
	public static boolean compare(Map<String, Integer> first, Map<String, Integer> second) {
		return (first.equals(second));
	}
	public static void printSimValues(Map<String, Integer> first, Map<String, Integer> second) {
		for(String str1: first.keySet()) {
			for(String str2: second.keySet()) {
				if(first.get(str1).equals(second.get(str2))) {
					System.out.println("The first key map "+str1+"\nThe second key map: "+str2);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> map1=new HashMap<>();
		map1.put("a", 10);
		map1.put("b", 20);
		map1.put("c", 30);
		
		Map<String, Integer> map2=new HashMap<>();
		map2.put("a", 60);
		map2.put("d", 20);
		map2.put("g", 90);
		
//		boolean i=compare(map1, map2);
//		System.out.println(i);
		System.out.println(compare(map1, map2));
		
		printSimValues(map1, map2);
		
		
		
	}
}
