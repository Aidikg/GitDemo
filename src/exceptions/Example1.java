package exceptions;

public class Example1 {
	public static void possExeption(int number) {
		int i=100;
		int result;
		// try -catch
		try {
			result=i/number;
		} catch(ArithmeticException ex) { // handling block
			System.out.println("hey buddy you cannot divide by zero");
			ex.printStackTrace();
		}
		
		System.out.println("Owooooooo");
		
//		int result=i/number;
//		System.out.println("Result: "+result);
	}
	
	public static void main(String[] args) {
		
		possExeption(0);  // ArithmeticException     // log
		
	}
}
