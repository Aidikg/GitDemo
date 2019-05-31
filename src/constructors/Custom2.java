package constructors;

public class Custom2 {
	String name, lname, hobby;
	int age;
	String phone, midName;
	
	public Custom2(String name, String lname) {
		this("Kurvna", 26);
		this.name=name;
		this.lname=lname;
	}
	public Custom2(String midName, int age) {
		this.midName=midName;
		this.age=age;
	}
	
	public String toString() {
		return new String("My first name is "+name+" and my age is "+ age);
	//	return new String("My first name is "+midName+" and my age is "+ age); // unreacheble code
	}
	
}
