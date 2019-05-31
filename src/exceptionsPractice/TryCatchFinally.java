package exceptionsPractice;

public class TryCatchFinally {
	
	public int met() {
		int a=0;
		int b=0;
		
		try {
			return a/b;
		} 
//		 catch(ArithmeticException e) {     // Unreacheble
//				return 0;
//			}
		
		catch(RuntimeException e) {
			return -1;
		}
//		 catch(ArithmeticException e) {     // Unreacheble
//			return 0;
//		}
		finally {
			System.out.println("done");
		}
		
	}
	
	public static void main(String[] args) {
		
		new TryCatchFinally().met();
	}
}
