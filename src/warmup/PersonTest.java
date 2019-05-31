package warmup;

public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();  // sample for Person class
		p1.name="John";
		p1.age=26;
		p1.gender='M';
		p1.job="SDET";
		p1.salary=130000;
		
		p1.run(10);
		p1.swim();
		p1.personJob();
		System.out.println();
		System.out.println("------------------------Second Object------------------");
		// Person p2
		Person p2=new Person();
		p2.name="Kate";
		p2.age=35;
		p2.gender='M';
		p2.job="Developer";
		p2.salary=150000;
		
		p2.personJob();
		p2.run(7);
		p2.swim();
		
		System.out.println();
		System.out.println(p2.name+" and "+p1.name+" working in IT industry");
		
		
	}
}
