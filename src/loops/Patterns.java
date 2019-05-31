package loops;

public class Patterns {
	public static void main(String[] args) {
		
		// Ex: bigger to small with digit
		int rows=5;
		for(int x=rows; x>0; x--) {
			for(int y=1; y<=x; y++) {
				System.out.print(y+ " ");
			}
			System.out.println();
		}
		
		
		// Example bigger -> small with star
//		int rows=5;
//		for(int i=rows; i>0; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		// Pattern with Alphabet
//		char last='E', alp='A';
//		for(int i=1; i<=(last-'A'+1); i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(alp+" ");
//			}
//			alp++;
//			System.out.println();
//		}
		
		
		// Example 2
//		int rows=5;
//		for(int i=1; i<=rows; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		// Example 1
//		int rows=5;
//		for(int i=1; i<=rows; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	}
}
