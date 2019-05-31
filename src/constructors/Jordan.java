package constructors;

public class Jordan {
	String name;
	int age;
	String color;
	
	// nameOfObject -> is going to be reference of this object
	
	public Jordan() {
		this(21);
	}
	public Jordan(int age) {
		
		this.age=age;
		
	}
	public Jordan(String howisit, int power, String art ) {
		this();
		
	}
	public Jordan(String name, String color, String ageStr) {
		this.color=color;
	}
	
	public String toString() {
		return new String("My name is "+ name +" my age "+age);
	}
}
