package shapes;

public class Test {
	public static void main(String[] args) {
		
		Circle c=new Circle(5);
		c.draw();
		System.out.println(c.calculateArea());
		
		Triangle t=new Triangle("Triangle class");
		t.draw();
		t.len1=5;
		t.len2=4;
		t.len3=3;
		System.out.println(t.calculateArea());
		
		
		
	}
}
