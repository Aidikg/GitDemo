package arrays;

import java.util.Scanner;

public class ExArray3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		// Self-Test Questions
		
		// Example 2
		char[] vowel= {'a', 'e', 'i', 'o','u'};
		for(int i=0; i<vowel.length; i++) {
			System.out.println(vowel[i] +" " +i);
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(i+" "); 
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			System.out.print(i*i+" ");
		}
		
		// Example 1
//		int[] arr=new int[10];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=2*i;
//		}
//		for(int element: arr) {
//			System.out.print(element+ " ");
//		}
		
		
		// Tricky Example
//		int[] count=new int[4];
//		count[0] = 0; 
//		count[1] = 0; 
//		count[2] = 0; 
//		count[3] = 0;
//
//		System.out.println("Please enter ten numbers between 0 and 3. ");
//		for(int i=0; i<10; i++) {
//			int num=input.nextInt();
//			count[num]++;     // without this you can enter 10 numbers
//		}
//		for(int i=0; i<count.length; i++) {
//			System.out.println("You entered "+count[i]+" "+i+" 's");
//		}
	}
}
