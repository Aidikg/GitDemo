package recap;

public class StaticObject {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="James";
		
		Student s2= new Student();
		s2.name="John";
		
		System.out.println(s1.name+ " "+s2.name);
		
		Student s3=s1;        // it is just variable 
		System.out.println(s3.name);
		
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s3: "+s3.hashCode());
		System.out.println("s2: "+s2.hashCode());
		
		s2=s1;
		System.out.println("After s2=s1   s2==: "+s2.hashCode());
		//System.out.println(s1);  // This NOT hashCode  output
		System.out.println("________________________________________________");
		method(s1);  // it will change inside the method but not in Object
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s3: "+s3.hashCode());
		System.out.println("s2: "+s2.hashCode());
	}
	
	public static void method(Student s) {
		s=new Student();
		s.name="Sarah";
		System.out.println("s: "+s.hashCode());
		System.out.println();
	}
}
