package arrays;

import java.util.Scanner;

public class ExArray2 {
	public static void main(String[] args) {
		int[] list=new int[10];
		System.out.println("Please enter non-negative numbers");
		System.out.println("Please enter negative number at the end");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int i=0;
		
		// Version 2
		while((i<list.length) && (num>=0)) {
			list[i]=num;
			i++;
			num=input.nextInt();
		}
		if(num>=0) {
			System.out.println("Couldnt read all numbers");
			System.out.println("only able to read "+list.length+" numbers");
		}
		
		//Version 1
//		while(num>=0) {
//			list[i]=num;
//			i++;
//			num=input.nextInt();
//		}
		
	}
}
