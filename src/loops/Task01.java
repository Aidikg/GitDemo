package loops;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		// Task1
		System.out.println("Enter positive number");
		int num=input.nextInt();
		
		for(int x=1; x<=num; x++) {
			if(x%2==0 && x%3==0) {
				int result=x*x;
				System.out.println(result+" ");
			}
		}
		
	}
}
