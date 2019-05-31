package warmup;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.model="toyota";
		c1.make="camry";
		c1.year=2017;
		c1.currentSpeed=55;
		
		c1.start();
		c1.accelerate(65);
		System.out.println();
		System.out.println("Slow down");
		c1.slowdown(50);
		System.out.println();
		System.out.println(c1.getCarInfo());
		c1.getDirections("right", "left", "right");
		
		long[] distances= {2,5,22,66,1,5};
		System.out.println("Total of distance: "+c1.getTotalDistance(distances));
		System.out.println("Max of Distance: "+c1.getMaxDistance(distances));
		
		long[] newDistance=c1.removeLongestDistance(distances);
		for(long d: newDistance) {
			System.out.print(d+ " ");
		}
		//System.out.println("Removing longest and shortest distance: "+c1.removeLongestDistance(distances));
		
	}
}
