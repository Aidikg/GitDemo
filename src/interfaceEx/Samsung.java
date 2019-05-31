package interfaceEx;

public class Samsung extends Phone {

	@Override
	public String faceID() {
		return "Samsung Face";
	}

	@Override
	public void location() {
		System.out.println("Samsung Location");
	}

	@Override
	public void capacity() {
		System.out.println("Samsung Capacity");
	}

	@Override
	void hi() {
		System.out.println("Samsung saying hi");
	}

	@Override
	public void lock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void text() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		
	}

}
