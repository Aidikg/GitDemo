package examples2;

class Parent {
	public Parent(int x) {
		System.out.println("From Parent Constructor");
	}
}


public class Child extends Parent{
	public Child() {
		super(50);
		System.out.println("From Child Constructor");
	}
	
	public static void main(String[] args) {
		Child objC=new Child();
	}
}
