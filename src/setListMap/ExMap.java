package setListMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExMap {
	public static void main(String[] args) {
		
		Map<Integer, String> states=new HashMap<>();
		states.put(1, "Germany");
		states.put(2, "Spain");
		states.put(4, "France");
		states.put(3, "Italy");
		
		String first=states.get(2);
		System.out.println(first);
		
		Set<Integer> keys=states.keySet();
		Collection<String> values=states.values();
		states.replace(1, "Poland");
		states.remove(2);
		
		for(Map.Entry<Integer, String> item: states.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue());
		}
		
		Map<String, Person2> people=new HashMap<>();
		people.put("123o9", new Person2("Tom"));
		people.put("987o9", new Person2("Bill"));
		people.put("456o9", new Person2("Nick"));
		
		for(Map.Entry<String, Person2> item: people.entrySet()) {
			System.out.println(item.getKey());
			System.out.println(item.getValue().getName());
		}
	}
}
class Person2{
	private String name;
	public Person2(String value) {
		name=value;
	}
	String getName() {
		return name;
	}
}




