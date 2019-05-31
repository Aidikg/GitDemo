

import java.util.Arrays;
import java.util.Scanner;

public class Chernovik {
	public int array(int[] nums) {
		int count=0;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]==6 && nums[i+1]==6) {
				count++;
			}
			if(nums[i]==6 && nums[i+1]==7) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Chernovik obj1=new Chernovik();
		int[] nums= {6,6,3,4,5,6,7};
		System.out.println(obj1.array(nums));
		
		
		
		
		
//		String str="abs123yakbed";
//		String str2="";
//		if(str.contains("yak")) {
//			str2=str.replace("yak", "");
//			
//		}
//		System.out.println(str2);
	}
	
	
	
//	public int[] removeDuplicates(int[] nums) {
//		int x=nums.length;
//		int[] unique=new int[x];
//		int p=0;
//		
//		for(int i=0; i<x; i++) {
//			int temp=nums[i];
//			int b=0;
//			
//			for(int j=0; j<x; j++) {
//				if(unique[j]!=temp) {
//					b++;
//				}
//				if(b==x) {
//					unique[p]=temp;
//					p++;
//				}
//			}
//		}
//		for(int i=0; i<p; i++) {
//			System.out.print(unique[i]);
//			if(i<p-1) {
//				System.out.print(",");
//			}
//		}
//		
//		return unique;
//		
//	}
//
//	public static void main(String[] args) {
//		Chernovik method=new Chernovik();
//		int[] nums1={2,55,77,3,4,2};
//		//int[] expected= {2,55,77,3,4};
//		System.out.println(method.removeDuplicates(nums1));
//	}
}
