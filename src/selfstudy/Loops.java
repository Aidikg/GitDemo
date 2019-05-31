package selfstudy;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		// Ex - if-statement with BREAK;
		System.out.println("Enter positive # and negative to stop then you will see summary");
		int sum=0;
		while(true) {
			int next=input.nextInt();
			if(next<0) {
				break;
			}
			else {
				sum+=next;
			}
		}
		System.out.println("Sum of positive numbers: "+sum);
		
		// loop2 with if statement
//		for(int n=1; n<=5; n++) {
//			if(n==3) {
//				break;  // try   continue;
//			}
//			System.out.println("hello");
//		}
//		System.out.println("After Loop");
		
		// Loop 1 with switch case
//		for(int i=0; i<=3; i++) {
//			switch(i) {
//			case 0:
//				System.out.println("Zero ");
//				break;
//			case 1:
//				System.out.println("One");
//				break;
//			case 2:
//				System.out.println("Two");
//				break;
//			case 3:
//				System.out.println("Three");
//				break;
//			default:
//				System.out.println("Out of list");
//			}
//		}
//		System.out.println("After the loop");
		
		
	}
}
