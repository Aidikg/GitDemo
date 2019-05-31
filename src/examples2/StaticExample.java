package examples2;

public class StaticExample {
	
	
	public static void newNum(int num) {
		num=8;
	}
	
	public static void main(String[] args) {
		
		int num=4;
		newNum(5);
		System.out.println(num);
		
	}
	
	
	
	
	
	
	
//	private static int one;
//	private static final int two;
//	private static final int three=3;
//	//private static final int four;   // DOES NOT Compile
//	
//	static {
//		one=1;
//		two=2;
//		//four=4;   
//		//three=6;  // CANNOT be reassigned
//	}
	
}
