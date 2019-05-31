package exceptions2;

public class NestedTryCatch {
	public static void main(String[] args) {
		
		try {
			try {
				System.out.println("Inside block-1");
				int b=45/0;
				System.out.println(b);
			}
			catch(ArithmeticException e1) {
				System.out.println("Exception ex-1");
			}
			try {
				System.out.println("Inside block-2");
				int b=45/0;
				System.out.println(b);
			}
			catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("Exception ex-2");
			}
			System.out.println("Just another statement ");
		}
		catch(ArithmeticException e3) {
			System.out.println("Arithmetic Exc -e3");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Exception e4");
		}
		catch(Exception e5) {
			System.out.println("Exception e5");
		}
		System.out.println("Next Statement");
		
	}
}
