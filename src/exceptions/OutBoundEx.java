package exceptions;

public class OutBoundEx {
	
	public static void outBound(int index) {
		String str="Techtorial";
		char ch=0;
		try {
			ch=str.charAt(index);
		}catch(StringIndexOutOfBoundsException s) {
			System.out.printf(String.format("Sorry your index %s more than length of string %s", index, str.length()-1));
			throw new NullPointerException();
		}
		catch(NullPointerException ex1) { // handling block
			System.out.println("NullPointer caughted");
			throw new RuntimeException();
		}
		catch(ArithmeticException ex2) { // handling block
			System.out.println("hey buddy you cannot divide by zero");
		}
		catch(RuntimeException r) {
			System.out.println("we are in Run time Exception");
		}
		
		finally {
			System.out.println("\nWe will execute finally anyway");
		}
		System.out.println();
		System.out.printf(String.format("the index of %d charackter from %s is %s ",index,str,  ch));
		
	}
	
	public static void main(String[] args) {
		outBound(16 );
	}
}
