package exceptionsPractice;

public class DoSmThing {
	
	public void go() {
		System.out.println("A");
		try {
			stop();
		}
		catch(ArithmeticException e) {
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
	
	public void stop() {
		System.out.println("E");
		Object x=null;
		x.toString();
		System.out.println("F");
	}
	
	public static void main(String[] args) {
		new DoSmThing().go();
	}
	
}
