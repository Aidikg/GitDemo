package project1;

import java.util.Scanner;

public class Library {
	Scanner input=new Scanner(System.in);
	static int total=10;
	//static int range=20;
	//int total=10;
	public void minus() {
		total--;
		System.out.println("Total: "+ total);
	}
	
	public void plus() {
		total+=80;
//		if(total==range) {
//			System.out.println("out of range");
//		}
		System.out.println("Total:" +total);
	}
//	public void takeBook() {
//		System.out.println("how many books You want to take");
//		int num=input.nextInt();
//		
//	}
	
	public static void main(String[] args) {
		Library test1=new Library();
		//test1.takeBook();
		test1.plus();
		test1.plus();
		
//		Library test2=new Library();
//		test2.plus();
//		
//		Library test3=new Library();
//		test3.minus();
	
	}
}
