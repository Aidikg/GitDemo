package setListMap;

import java.util.HashSet;

public class ExSet {
	public static void main(String[] args) {
		
		HashSet<String> states=new HashSet<>();
		states.add("Germany");
		states.add("France");
		states.add("Italy");
		
		System.out.println("If I try put Germany second time");
		boolean isAdded=states.add("Germany");
		System.out.println(isAdded);
		
		System.out.println("States size: "+ states.size());
		
		for(String s: states) {
			System.out.println(s);
		}
		
		System.out.println("Removing Germany");
		states.remove("Germany");
		
		// hashTable with object Person
		HashSet<Person> people=new HashSet<>();
		people.add(new Person("Mike"));
		people.add(new Person("Tom"));
		people.add(new Person("Nick"));
		
		for(Person p: people) {
			System.out.println(p.getName());
		}
		
	}
}
class Person{
	private String name;
	public Person(String value) {
		name=value;
	}
	
	String getName() {
		return name;
	}
}









