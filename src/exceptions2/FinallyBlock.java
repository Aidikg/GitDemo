package exceptions2;

public class FinallyBlock {
	public static void main(String[] args) {
		
		try {
			int num=67/0;
			System.out.println(num);
		}
		
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("Number cannot divide by zero");
//		}
		
		catch(ArithmeticException e){
			System.out.println("Number cannot divide by zero");
		}
		
//		catch(Exception e) {
//			System.out.println("Invalid");
//		}
		finally {
			System.out.println("This is finally-block");
		}
		System.out.println("Out of try-catch block");
		
		for(int i=0; i<3; i++) {
			System.out.println("Hello World");
		}
		
	}
}
