package shapes;

public class Triangle extends Shape {

	int len1, len2, len3;
	
	@Override
	public double calculateArea() {
		return (len2*len3*(Math.sin(len1)))/2;
	}
	public void draw() {
		System.out.println("Draw from Triangle");
	}
	
	public Triangle(String name) {
		super(name);
	
	}


	
}
