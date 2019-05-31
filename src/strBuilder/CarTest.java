package strBuilder;

public class CarTest {
	public static void main(String[] args) {
		
		//Example 3
		StringBuilder house=new StringBuilder("Single ");
		//house.insert(8,"house"); // String Index Out of Bound
		house.insert(7,"house");
		System.out.println(house);
		
		// Example 2
		StringBuilder car=new StringBuilder("toyota ");
		car.append(2019);
		System.out.println(car);
		car.insert(6, " camry");
		System.out.println(car);
		
		
		// Example 1
//		StringBuilder location=new StringBuilder("Des Plaines");
//		System.out.println(location.charAt(2));
//		
//		System.out.println(location.indexOf("P"));
//		System.out.println(location.substring(0,3));
//		System.out.println(location.length());
//		
//		System.out.println(location);
		
	}
}
