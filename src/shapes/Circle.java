package shapes;

public class Circle extends Shape {

	int radius;
	public Circle() {
		super("Circle");
	}
	
	public Circle(int radius) {
		this();
		this.radius=radius;
	}

	@Override
	public double calculateArea() {
		
		return radius*radius*3.14;
	}
	
	public void draw() {
		System.out.println("Drawing circle with radius: "+radius);
	}
	
}
