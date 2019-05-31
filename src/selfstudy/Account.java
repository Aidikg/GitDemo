package selfstudy;

public class Account {
	int deposit;
	int balance;
	String name;
	String accountNum="1234567";
	int addedValue=10;
	
	public int addDeposit(int addAmount) {
		balance=balance+addAmount;
		System.out.println("Current balance is "+balance);
		return balance;
	}

	public int withDraw(int amount) {
		// TODO Auto-generated method stub
		balance=balance-amount;
		System.out.println("Current balance is "+balance);
		return balance;
	}
	
//	public String changeAccNum(String accountNum) {  // here will not change
//		accountNum="7654321";
//		return accountNum;
//	}
	
	public String changeAccNum(String number) {
		accountNum=number;
		return accountNum;
	}
	
	
}
