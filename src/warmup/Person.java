package warmup;

public class Person {
	String name;
	int age;
	char gender;
	int salary;
	String job;
	
	public void run(int miles) {
		System.out.println(name+" is running "+miles+" miles");
	}
	
	public void swim() {
		System.out.println(name+" is swimming. ");
	}
	
	public void personJob() {
		System.out.println(name+ " is working "+job+" and making "+salary);
	}
}
