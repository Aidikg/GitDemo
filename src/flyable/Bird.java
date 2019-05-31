package flyable;

public class Bird implements Flyable, Sound {
	
	public void fly() {
		System.out.println("Fly High");
	}

	@Override
	public void sounds() {
		
		System.out.println("Chik chik");
	}
	
}
