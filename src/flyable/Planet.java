package flyable;

public class Planet implements Flyable, Sound { // plane

	@Override
	public void sounds() {
		System.out.println("noisy");
		
	}

	@Override
	public void fly() {
		System.out.println("Fly like a plane");
		
	}

}
