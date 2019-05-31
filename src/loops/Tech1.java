package loops;

import java.util.Scanner;

public class Tech1 {
	public static void main(String[] args) {
		
		// Multiple -Table
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=input.nextInt();
		
		for(int i=0; i<=10; i++) {
			System.out.println(number+ " x "+i+" = "+(number*i));
		}
		
//		for(int x=0; x<=20; x+=2) {
//			System.out.print(x+" ");
//		}
		
//		String name="Techtorial";
//		
//		for(int length=name.length(); length>=0; length--) {
//			System.out.println(name.substring(0, length));
//		}
		
	
	}
}
