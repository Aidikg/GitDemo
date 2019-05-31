package arrays;

import java.util.Scanner;

public class StringToArray {
	public static void main(String[] args) {
		// Example 3 -> I love Java -> Java love I
		String str="I love Java";
		String[] words=str.split(" ");
		String reverse="";
		
		for(int i=0; i<words.length; i++) {
			System.out.print(words[i]+" ");
		}
		System.out.println();
		for(int i=words.length-1; i>=0; i--) {
			reverse=reverse+words[i]+" ";
		}
		System.out.println(reverse.trim());
		
		// Example 2
//		int result=0;
//		int[] nums=new int[5];
//		Scanner input=new Scanner(System.in);
//		System.out.println("Please can you enter 5 numbers");
//		
//		for(int i=0; i<nums.length; i++) {
//			nums[i]=input.nextInt();
//		}
//		System.out.println("Do you want + or * result?");
//		String ans=input.next();
//		
//		if(ans.equalsIgnoreCase("+")) {
//			for(int i=0; i<nums.length; i++) {
//				result+=nums[i];
//			}
//		}else if(ans.equalsIgnoreCase("*")) {
//			for(int i=0; i<nums.length; i++) {
//				if(i==0) {
//					result=1;
//				}
//				result*=nums[i];
//			}
//		}
//		System.out.println(result);
		
		// Example 1
//		String word="apple";
//		char[] arr=new char[word.length()];
//		
//		for(int i=0; i<word.length(); i++) {
//			arr[i]=word.charAt(i);  // saving in arr[i]
//			System.out.print(arr[i]);
//		}
//		System.out.println();
//		
//		for(int i=word.length()-1; i>=0; i--) {
//			arr[i]=word.charAt(i);
//			System.out.print(arr[i]);
//		}
	}
}
