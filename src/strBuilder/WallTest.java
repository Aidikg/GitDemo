package strBuilder;

public class WallTest {
	public static void main(String[] args) {
		Wall wall =new Wall(5,4);
		System.out.println("Area= "+wall.getArea());
		wall.setHeight(-1.5);
		System.out.println("width= " + wall.getWidth());
		System.out.println();
		System.out.println("height= "+ wall.getheight());
		System.out.println("Area: "+wall.getArea());

	}
}

//area= 20.0
//width= 5.0
//height= 0.0
//area= 0.0