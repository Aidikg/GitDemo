package exceptions2;

public class CatchThrow {
	
	private static void throwsMethod() throws NumberFormatException{
		String intNumber="5A";
		Integer.parseInt(intNumber);
	}
	
	private static void catchMethod() {
		
		try {
			throwsMethod();
		}
		catch(NumberFormatException e) {
			System.out.println("Convertion Error");
		}
		
	}
	
	public static void main(String[] args) {
		catchMethod();
		
		System.out.println("Main method ");
	}
}
