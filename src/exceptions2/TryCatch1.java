package exceptions2;

public class TryCatch1 {
	public static void main(String[] args) {
		
		// Multiple try-catch
		int[] num=new int[3];
		
		try {
			num[4]=29;
			System.out.println("index 4 in try block");
		}
		catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of bound");
		}
		catch(Exception e) {
			System.out.println("Exception Occur");
		}
		System.out.println("Out of try-catch block");
		
		
		// Try -catch
//		int num, res;
//		try {
//			num=89;
//			res=num/0;
//			System.out.println(res);
//			System.out.println("end of try block");
//		}
//		catch(ArithmeticException ex) {
//			System.out.println("You cannot divide by zero");
//		}
//		catch(Exception e) {
//			System.out.println("Exc occurs");
//		}
//		System.out.println("Out of try-catch block");
		
	}
}
