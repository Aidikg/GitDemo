package arraysByMyself;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Scanner;

public class CheckTask {
	
	public int[] removeDuplicates(int[] nums) {
		int x=nums.length;
		int[] unique=new int[x];
		int p=0;
		
		for(int i=0; i<x; i++) {
			int temp=nums[i];
			int b=0;
			
			for(int j=0; j<x; j++) {
				if(unique[j]!=temp) {
					b++;
				}
				if(b==x) {
					unique[p]=temp;
					p++;
				}
			}
		}
		for(int i=0; i<p; i++) {
			System.out.print(unique[i]);
			if(i<p-1) {
				System.out.print(",");
			}
		}
		
		return unique;
		
	}

	public static void main(String[] args) {
		CheckTask method=new CheckTask();
		int[] nums1={2,55,77,3,4,2};
		int[] expected= {2,55,77,3,4};
		System.out.println(method.removeDuplicates(nums1));
	}
	
	
//	public static void main(String[] args) {
//		int num[]={1,2,5,4,1,2,3,5};
//	     for(int i =0;i<num.length;i++)
//	     {
//	         boolean isDistinct=false;
//	         for(int j=0;j<i;j++)
//	         {
//	             if(num[j]==num[i])
//	             {
//	                 isDistinct=true;
//	                 break;
//	             }
//	         }
//	         if(!isDistinct)
//	         {
//	             System.out.print(num[i]+" ");
//	         }
//	     }
//	}
	
//	public int[] removeDuplicates(int[] nums) {
//		
//		int arr[]=new int[nums.length];
//		for(int i=0; i<nums.length; i++) {
//			for(int j=i+1; j<nums.length; j++) {
//				if(nums[i]!=nums[j]) {
//					arr[j]=nums[i];
//				}
//			}
//		}
//		
//		return arr;
//	}

//	public static void main(String[] args) {
//		CheckTask method=new CheckTask();
//		int[] nums1={2,55,77,3,4,2};
//		int[] expected= {2,55,77,3,4};
//		System.out.println(method.removeDuplicates(nums1));
//		
//	}
	
	
	
	// Example 3
//     public long combineNumbers(int[] numbers) {
//		String exp="";
//    	 for(int i=0; i<numbers.length; i++) {
//    		exp=exp+""+Math.abs(numbers[i]);
//    		//return exp;
//    		
//    	 }
//    	 long expLong=Long.parseLong(exp);
//		return expLong;
//	}
//	
//	
//	public static void main(String[] args) {
//		CheckTask method=new CheckTask();
//		int[] nums2={2,67,85,4};
//		int expected2= 267854;
//		//assertEquals(expected2,method.combineNumbers(nums2));
//		System.out.println(method.combineNumbers(nums2));
//	}
	
	
//	public int[] twoSum(int[] nums, int target) {
//		int newArr[]=new int[2];
//		int count=0;
//		
//		for(int i=0; i<nums.length-1; i++) {
//			if(i+i==target) {
//				count++;
//				newArr[count]=nums[i];
//			}
//			return newArr[count];
//		}
//	
//		
//	    return null;
//	}
//	
//	public static void main(String[] args) {
//		CheckTask method=new CheckTask();
//		int[] nums ={7, 3};
//		int target =10;
//		int[] expected ={0, 1};
//		System.out.println(method.twoSum(nums, target));
//		//assertArrayEquals(expected, method.twoSum(nums, target));
//	}
	
	
	// Example 2
//public int outOfOrder(int[] arr){
//		
//		for(int i=0; i<arr.length-1; i++ ) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]>arr[j]) {
//					return arr[j];
//				}
//			}
//		}
//		
//		return -1;
//}	
//		public static void main(String[] args) {
//			CheckTask method=new CheckTask();
//			int [] pages={3,66,77,78,79,90,87};		
//			System.out.println(method.outOfOrder(pages));
//		}
	
	
	// example 1
//	public int[] removeDuplicates(int[] nums) {
//		int[] expect=new int[nums.length];
//		for(int i=0; i<nums.length-1; i++) {
//			int count=0;
//			for(int j=i+1; j<nums.length-1; j++) {
//				if(nums[i]!=nums[j]) {
//					count++;
//					expect[count]=nums[j];
//				}
//			}
//		}
//		
//		return expect ;
//	}
//	
//	public static void main(String[] args) {
//		CheckTask method=new CheckTask();
//		int[] nums={2,55,77,3,4,2};
//		int[] expect= {2,55,77,3,4};
//		System.out.println(method.removeDuplicates(expect));
//		//assertArrayEquals(expect,method.removeDuplicates(nums));
	
}
