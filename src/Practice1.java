import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// what	is	the	value	of	each	
		//of	the	following	boolean	expressions	if	x	is	5,y is 10, and z	is	15?
		int x=5, y=10, z=15;
		System.out.println(x<5 && y>x);   // false
		System.out.println(x<5 || y>x);   // true
		System.out.println(x>3 || y<10 && z==15); // true
		System.out.println(!(x>3)&& x!=z || x+y==z); // true
		
		
		/*
		 * we	would	like	to	assess	a	service	charge	for	cashing	a	check.	
		 * The	service	charge depends on the amount of the check. If the check amount is 
		 * less than	$10,	we	will	charge	$1.	if	the	amount	is	greater	than	
		 * $10	but	less	than	$100,	we	will	charge	10	percent	of	the	amount.	
		 * if	the	amount	is	greater	than	$100,	but	less	than	$1,000,	we	will	
		 * charge	$5	plus	5	percent	of	the	amount.	if	the	value	is	over	
		 * $1,000,	we	will	charge	$40	plus	1	percent	of	the amount. 
		*/
//		System.out.println("Enter your amount ");
//		int amount=input.nextInt();
//		if(amount<10) {
//			System.out.println("We will charge: 1$");
//		}
//		else if(amount >10 && amount <100) {
//			System.out.println("We will charge: "+(amount*10)/100);
//		}
//		else if(amount>100 && amount<1000) {
//			System.out.println("We will charge: "+(5+((amount*5)/100)));
//		}
//		else {
//			System.out.println("We will charge: "+(40+(amount*1/100)));
//		}
		
		
		
		
		//Example 6 but in different way
//		int x=11;  // 4-C 5-C 6-A,B 9-A,B 10-A 11-A
//		if(x>5) {
//			System.out.println("A");
//			if(x<10) {
//				System.out.println("B");
//			}
//		}
//		else {
//			System.out.println("C");
//		}
		
		// Example 6
//		int x=10;  // 4-B 5-B 6-A 9-A 10-A 11-A
//		if(x>5) {
//			System.out.println("A");
//		}
//		else if(x<10) {
//			System.out.println("B");
//		}
//		else {
//			System.out.println("C");
//		}
		
		//Example 5
//		System.out.println("Please enter your response: Yes/No");
//		boolean accept;
//		String ans=input.nextLine().toLowerCase();
//		if(ans.equals("yes") || ans.equals("y")) {
//			System.out.println(accept=true);
//		}
//		else if(ans.equals("no") || ans.equals("n")) {
//			System.out.println(accept=false);
//		}
//		else {
//			System.out.println("Invalid");
//		}
		
		// Example 4
//		int x=26;
//		if(x%2==0) {
//			System.out.println(x/2);
//		}
//		else {
//			System.out.println((x*3)-1);
//		}
		
		
		//Example 3
//		System.out.println(true && false);
//		System.out.println(true || false);
//		int x=9;
//		System.out.println(false && (x>0));
//		System.out.println(true || (x>0));
//		
		
		// Example 2
//		System.out.println(false);
//		System.out.println(7<0);
//		System.out.println(7>0);
//		int n=7;
//		System.out.println(n>0);
		
		
		// Example 1
//		int number=7;
//		boolean isPositive=(number>0);
//		if(number>0) {
//			number=-100;
//		}
//		if(isPositive) {
//			System.out.println("Positive");
//		}
//		else {
//			System.out.println("Not positive");
//			System.out.println(number);
//		}
	}
}
