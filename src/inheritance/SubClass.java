package inheritance;

class Super_class{
	int num=20;
	public void display() {
		System.out.println("This is the display method of SuperClass");
	}
}

public class SubClass extends Super_class {
	int num=10;
	public void display() {
		System.out.println("This is the display method of subclass");
	}
	public void myMet() {
		SubClass sub=new SubClass();
		
		sub.display();
		super.display();
		
		System.out.println("Value of the variable in sub_class "+sub.num);
		System.out.println("Value of the variable in super class"+ super.num);
		
	}
	
	public static void main(String[] args) {
		
		SubClass obj=new SubClass();
		obj.myMet();
		
	}
	
	
	
	
	
	
	
	
}
