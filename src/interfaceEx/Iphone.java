package interfaceEx;

public class Iphone extends Phone {

	@Override
	public String faceID() {
		
		return "My Face";
	}

	@Override
	public void location() {
		System.out.println("Iphone Location");
		
	}

	@Override
	public void capacity() {
		System.out.println("Iphone Capacity");
		
	}

	@Override
	void hi() {
	System.out.println("Iphone Call");
	}

	@Override
	public void lock() {
		System.out.println("Iphone is calling");
		
	}

	@Override
	public void call(int num) {
		System.out.println("Iphone is calling "+num);
	}

	@Override
	public void text() {
		System.out.println("Iphone texting");
	}

	@Override
	public void takePicture() {
		System.out.println("Iphone taking picture");
	}
	
}
