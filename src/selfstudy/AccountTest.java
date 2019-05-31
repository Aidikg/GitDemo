package selfstudy;

import java.util.Scanner;

public class AccountTest {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Account account=new Account();
//		account.name="James";
//		account.balance=0;
//		
//		// Deposit
//		System.out.println("Enter deposit amount: ");
//		account.addDeposit(sc.nextInt());   //addAmount
//		account.addDeposit(sc.nextInt());   // addAmount
//	    System.out.println("Enter deposit amount: ");
//		account.addDeposit(sc.nextInt());   // addAmount
//		
//		
//	    System.out.println("Enter withdraw amount: ");
//		account.withDraw(sc.nextInt()); 
		
		
		Account account=new Account();
		account.changeAccNum("7654321");
		System.out.println(account.accountNum);
		
		
	
	}
}
