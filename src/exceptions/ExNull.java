package exceptions;

import java.util.Scanner;

public class ExNull {
	
	public static void met1() {
	Scanner input=new Scanner(System.in);
	
	int[] num=new int[3];
	int n;
	
	for(int i=0; i<4; i++) {
		try {
			n=input.nextInt();
		}catch(Exception e) {
			System.out.println("Out of bound");
		}
	}
	}
	public static void main(String[] args) {
		met1();
	}
}
