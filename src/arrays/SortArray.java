package arrays;

import java.util.*;
import java.util.Arrays;


public class SortArray {
	public static void main(String[] args) {
		
		// Multidimensional Array
		String[][] storage=new String[2][3];
		storage[0][0]="zeroTozero";
		storage[0][1]="zeroToOne";
		storage[0][2]="zeroToTwo";
		
		storage[1][0]="oneTozero";
		storage[1][1]="oneToOne";
		storage[1][2]="twoToTwo";
		
		for(String[] box: storage) {
			for(String b: box) {
				System.out.println(b);
			}
		}
		
		
		// Sort String  For- Each works with Arrays
//		String[] animals= {"wolf","dog", "cat", "bird", "elephant"};
//		Arrays.sort(animals);
//		
//		for(String a: animals) {
//			System.out.print(a+" ");
//		}
		
		
		// Sort Numbers
//		Scanner input=new Scanner(System.in);
//		int[] nums=new int[5];
//		System.out.println("Enter numbers to sort");
//		
//		for(int i=0; i<nums.length; i++) {
//			nums[i]=input.nextInt();
//		}
//		Arrays.sort(nums);
//		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
	}
}
