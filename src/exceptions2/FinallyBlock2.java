package exceptions2;

public class FinallyBlock2 {
	public static void main(String[] args) {
		
		// try-catch-finally 2
		try {
			System.out.println("First statement of Try block");
			int num=45/0; 
			System.out.println(num);
		}
		catch(ArithmeticException e) {  // Exception 
			System.out.println("Cannot divide by zero");
		}
		finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("Out of try-catch-finally block");
		
		
		
		
		
		
		
		// Try-Catch-Finally
//		try {
//			System.out.println("First statement of Try block");
//			int num=45/3; // 45/0
//			System.out.println(num);
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Out Of Bound");
//		}
//		finally {
//			System.out.println("Finally Block");
//		}
//		
//		System.out.println("Out of try-catch-finally block");
		
	}
	
	
	
	
	
	
	// Example 1
//	public static void main(String[] args) {
//	//	myMethod();
//		System.out.println(FinallyBlock2.myMethod());
//	}
//
//	
//	public static int myMethod() {
//		try {
//			return 112;
//		}
//		finally {
//			System.out.println("This is finally-block");
//			System.out.println("Bye");
//		}
//	}
}
