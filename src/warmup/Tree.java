package warmup;

import java.util.Scanner;

public class Tree {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Can you give me number of long");
		int num=input.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>=i; j--) {
				System.out.print(" ");
				
			}
			for(int st=0; st<i+1; st++) {
				System.out.print("*");
			}
			for(int s=0; s<i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
