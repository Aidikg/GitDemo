package recap;

public class studentExample {
	public static void main(String[] args) {
		
		Student.name="Jim";
		Student s1=new Student();
		System.out.println(s1.name);
		
		Student s2=new Student();
		
		s1.name="John";
		s2.name="Jackie";
		
		System.out.println("s1: "+s1.name);
		System.out.println("s2: "+ s2.name);
		s1.study();
		s1.name="David";
		s2.study(5);
		s2.study("Java assigment");
		s1.name="Aidina";
		s2.study();
		
		
	}
}
