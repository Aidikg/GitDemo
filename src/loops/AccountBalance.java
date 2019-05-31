package loops;

import java.util.Scanner;

public class AccountBalance {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your balance: ");
		int b=input.nextInt();
		
		while(b>0) {
			System.out.println("Enter your transaction amount: ");
			int t=input.nextInt();
			
			if(t>b) {
				System.out.println("Your balance: "+b );
				break;
			}
			else {
				b-=t;
			}
			 
		}
		System.out.println("Your balance: "+b);
	}
}
