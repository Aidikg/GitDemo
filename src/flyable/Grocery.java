package flyable;

public class Grocery implements Store {

	@Override
	public void sellitem() {
		System.out.println("fruits");
	}

	@Override
	public void displayItem() {
		System.out.println("Displaying candies");
	}
	
	
	
}
