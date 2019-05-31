package constructors;

public class Person {
	private String name;
	private String lname;
	private int age;
	
	public Person(String name, String lname, int age) {
		this.name=name;
		this.lname=lname;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public String getlname() {
		return lname;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
}
