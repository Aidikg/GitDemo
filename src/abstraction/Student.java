package abstraction;

public abstract class Student {
	
	int studentID;
	String name;
	
	public void study() {
		System.out.println("Studying");
	}
	
	public abstract void attendClass();
	
}
