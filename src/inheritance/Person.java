package inheritance;

public class Person {
	
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public Person() {
		name="no name yet";
	}
	public Person(String initialName) {
		name=initialName;
	}
	
	public void writeOutput() {
		System.out.println("Name "+name);
	}
	
	public boolean hasSameName(Person otherperson) {
		return this.name.equalsIgnoreCase(otherperson.name);
	}
	
}
