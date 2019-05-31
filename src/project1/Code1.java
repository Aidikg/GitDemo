package project1;

import java.util.Arrays;

public class Code1 {
	int a=10;
	int b=10;
	
	public static void main(String[] args) {
		
		Code1 obj1=new Code1();
		
		Code1 obj2=new Code1();
		
		if(obj1.a==obj2.b) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		if(obj1.equals(obj2)) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		
//		int[] nums= {1,3,6};
//		int[] arr=new int[nums.length*2];
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=0;
//		}
//		arr[arr.length-1]=nums[nums.length-1];
//		System.out.println(Arrays.toString(arr));
	}
}
