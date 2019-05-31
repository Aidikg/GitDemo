package arrays2;

import java.util.Scanner;

public class ArraysToMethod {
	
	public int max(int[] array) {
		int max=array[0];
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int[] myArr=new int[size];
		
		System.out.println("Enter elements of the Array");
		
		for(int i=0; i<myArr.length; i++) {
			myArr[i]=sc.nextInt();
		}
		
		ArraysToMethod obj=new ArraysToMethod();
		System.out.println("Max val of Array is: "+obj.max(myArr));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
