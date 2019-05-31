package recap;

public class Student {
	static String name;
	int age;
	
	public void study() {
		System.out.println(name+ " study");
	}
	
	public void study(int hours) {
		System.out.println(name+ " is studying "+hours+" hours");
	}
	
	public void study(String homework) {
		System.out.println(name+ " has to do his "+homework);
	}
}
