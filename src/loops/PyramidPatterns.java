package loops;

public class PyramidPatterns {
	public static void main(String[] args) {
		
		// Example Printing Tringle
		int n=5;
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>1; j--) {
				System.out.print("__");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Example 
//		int rows=4, num=1;
//		for(int i=1; i<=rows; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(num+" ");
//				num++;
//			}
//			System.out.println();
//		}
		
	
		// Ex Inverted Pyramid
//		int rows=5;
//		for(int i=rows; i>=1; i--) {
//			//space
//			for(int space=1; space<=rows-i; space++) {
//				System.out.print("__");
//			}
//			
//			// Star
//			for(int j=i; j<=2*i-1; j++) {
//				System.out.print("* ");
//			}
//			
//			// Star
//			for(int j=0; j<i-1; j++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
		// Example 1
//		int rows=5, k=0;
//		
//		for(int i=1; i<=rows; i++, k=0) {
//			for(int space=1; space<= rows-i; space++) {
//				System.out.print(" ");
//			}
//			while(k!=2*i-1) {
//				System.out.print("* ");
//				k++;
//			}
//			System.out.println();
//		}
		
	}
}
