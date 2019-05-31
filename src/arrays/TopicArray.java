package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TopicArray {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] item=new String[6];
		int count=1;
		
		// Second way
		for(int x=0; x<item.length; x++) {
			System.out.println("Please enter the "+ count+". product");
			item[x]=input.nextLine();
			count++;
		}
		System.out.println(Arrays.toString(item));
		// Arrays class is coming from java.util. package 
		// we can print out all values using this method  ->  Arrays.toString(item)
		
		// First way
//		for(int i=0; i<item.length; i++) {
//			System.out.println("Please enter "+i+" product");
//			item[i]=input.next();
//		}
//		
//		for(int j=0; j<item.length; j++) {
//			System.out.print(item[j]+ " ");
//		}
		
		
		// Example 1
//		String[] grocery= {"apple", "orange", "milk","egg", "bread", "cheese", "pear", "bagel", "juice","rise", "choco", "cake", "water"};		
//		for(int x=0; x<grocery.length; x++) {
//			System.out.println("Name of product: "+grocery[x]);
//		}
		
		// Arrays in STRING
//		String[] name=new String[6];
//		name[0]="Aku";
//		name[1]="Toku";
//		name[2]="Asel";
//		name[0]="Guku";
//		
//		System.out.println(name[1]); //Toku
//		System.out.println(name[5]); // null
//		//System.out.println(name[7]); // ArrayIndexOutOfBoundsException
//		System.out.println(name[0]);
		
		// if want reassign the value. The value will be last assigned value.
		// String[] str  ->  Declaration
		// str=new String[5]  -> Initialization
		// str[0]="Aku";   -> Assignment
		
//		String str[0]="Aku";  
//		String str[1]="Aku";  -> Duplicate VALUE  : YOu CAN 
		
//		int num1=6;  
//		int num1=7;  -> Duplicate Variable  you CAN NOT
		
		
		
		// Arrays in NUMBER
//		int[] num=new int[5];
//		// Array is fixed size
//		// Array is ordered list
//		// if you dont assig any value inside the array, the value
//		// will be default value of the type = 0.   ZERO
//		num[0]=5;
//		num[1]=10;
//		
//		// { 5, 10, 0, 0 }
//		System.out.println(num[2]);
		
	}
}
