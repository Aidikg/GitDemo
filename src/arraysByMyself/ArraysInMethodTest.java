package arraysByMyself;

import java.util.Arrays;

public class ArraysInMethodTest {
	public static void main(String[] args) {
		ArraysInMethod obj=new ArraysInMethod();
		
		// Example 2
		int[] b= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(obj.reverse(b)));
		
		
		
		//Example 1
		int[] a= {2,4,6,3,8,9};
		obj.printArr(a);
	}
}
