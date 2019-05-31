package selfstudy;

import java.util.Arrays;

public class ArrayInserting {
	public static void main(String[] args) {
		
		// Check arrays is equal
		int[] arr1= {0,2,4,6,8,10};
		int[] arr2={0,2,4,6,8,10};
		int[] arr3= {10,8, 6,4, 2,0};
		boolean check1=Arrays.equals(arr1, arr2);
		boolean check2=Arrays.equals(arr1, arr3);
		System.out.println(check1);
		System.out.println(check2);
		
		//binarySearch()
//		int[] arr= {0,2,4,6,8,10};
//		int index2=Arrays.binarySearch(arr, 6);  // search 6 -> output index# of 6
//		int index=Arrays.binarySearch(arr, 0,4,8); // serach 8 between 0-4
//		int index1=Arrays.binarySearch(arr, 7);
//		System.out.println(index);
		
		
		
		// Copy Second way
//		int[] source=new int[10];
//		for(int i=0; i<source.length; i++) {
//			source[i]=i+10;
//		}
//		int[] dest=Arrays.copyOf(source, source.length);
//		Arrays.sort(dest);
//		System.out.println(Arrays.toString(dest));
		
		// Copy arr first way
//		int[] source=new int[10];
//		int[] dest=new int[10];
//		
//		for(int i=0; i<source.length; i++) {
//			source[i]=i+5;
//		}
//		System.out.println("Source");
//		System.out.println(Arrays.toString(source));
//		System.out.println("Dest");
//		for(int j=5; j<source.length; j++) {  // or just start with j =0
//			dest[j]=source[j];
//		}
//		System.out.println(Arrays.toString(dest));
		
		
		// Insert new value
//		int[] arr=new int[20];
//		int insertIndex=10;
//		int newValue=123;
//		
//		for(int i=arr.length-1; i>insertIndex; i--) {
//			arr[i]=arr[i-1];    // arr[i]=i-1;  -> two difference things
//			//System.out.println(arr[i]);
//		}
//		
//		// insert new value
//		arr[insertIndex]=newValue;
//		System.out.println(Arrays.toString(arr));

	}
}
