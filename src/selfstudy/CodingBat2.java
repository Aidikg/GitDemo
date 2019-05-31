package selfstudy;

import java.util.Arrays;

public class CodingBat2 {
	public static void main(String[] args) {
		
		int num=4;
		int[] arr=new int[num];
		for(int i=0; i<num; i++) {
			arr[i]=i;
		}
		System.out.println(Arrays.toString(arr));
		
//		int[] nums= {2,3,4,5,0,6};
//		int count=0;
//		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(i);
//			System.out.println(nums[i]%2);
////			
////			if(i%2==0) {
////				
////				count++;
////			}
//		}
//	//	System.out.println(count);
		
		
		
		//Example 3
//		String word="This";
//		String sep="And";
//		int num=3;
//		String result="";
//		
//		for(int i=0; i<num; i++) {
//			if(i<num-1) {
//				result+=word+sep;
//			}
//			else {
//				result+=word;
//			}
//		}
//		//result=result.substring(result.length()-sep.length());
//		System.out.println(result);
		
		
		
		// Example 2
//		String a="abc";
//		String b="deft";
//		String result="";
//		int max=Math.max(a.length(), b.length());
//		for(int i=0; i<max; i++) {
//			if(i<=a.length()-1) {
//				result+=a.substring(i, i+1);
//			}
//			if(i<=b.length()-1) {
//				result+=b.substring(i, i+1);
//			}
//		}
//		System.out.println(result);
		
//		for(int i=0; i<a.length(); i++) {
//			result+=a.charAt(i);
//			for(int j=i; j<i+1; j++) {
//				result+=b.charAt(j);
//			}
//			
//		}
//		System.out.println(result);
		
		// Example 1
//		String str="abcdefgtrg";
//		String result="";
//		
//		for(int i=1; i<str.length()-1; i+=3) {
//			result+=str.substring(i, i+2)+str.substring(i-1, i);
//		}
//		System.out.println(result);
		
	}
}
