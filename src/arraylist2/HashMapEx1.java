package arraylist2;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
	public static void main(String[] args) {
		
		Map<String, Integer> map1=new HashMap<>();
		map1.put("egg", 2);
		map1.put("orange", 5);
		map1.put("lemon",3);
		
		for(String key: map1.keySet()) {
			System.out.println(key+" "+ map1.get(key));
		}
		
	}
}
