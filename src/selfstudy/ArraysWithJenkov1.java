package selfstudy;

public class ArraysWithJenkov1 {
	public static void main(String[] args) {
		
		// Multidimensional Arrays
		int[][] arr=new int[2][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("i: "+i+" , j: "+j);
			}
			System.out.println();
		}
		
		// Arrays 1
//		String[] str=new String[5];
//		for(int i=0; i<str.length; i++) {
//			str[i]="String no "+i;
//		}
//		for(int i=0; i<str.length; i++) {
//			System.out.println(str[i]);
//		}
//		
//		System.out.println("With for Each");
//		for(String i: str) {
//			System.out.println(i);
//		}
	}
}
