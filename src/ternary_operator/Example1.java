package ternary_operator;

public class Example1 {
	public static void main(String[] args) {
		
		// Example 7
		// Sysout(( number%3==0) ? i : j;
		int number=24;
		if(number%3==0) {
			System.out.println("i");
		}
		else {
			System.out.println("y");
		}
		
		
		// Example 6
		// tax=(income >1000)? income*0.2 : income*0.17 + 1000;
		double tax;
		double income=1080;
		if(income>1080) {
			tax=income * 0.2;
			System.out.println(tax);
		}
		else {
			tax=income * 0.2+1000;
			System.out.println(tax);
		}
		
		
		
		// Example 5
		// score =(x>10)? 3*scale : 4*scale;
		int score, a=11, scale=5;
		if(a>10) {
			score=3*scale;
			System.out.println(score);
		}
		else {
			score=4*scale;
			System.out.println(score);
		}
		
		
		//Example 4
		//sysout(num%2==0) ? "num is even" : "num is odd");
		int num=16;
		if(num%2==0) {
			System.out.println("Num is even");
		}
		else {
			System.out.println("Num is odd");
		}
		
		
		// Example 3
		// max=(num1> num2)? num1 : num2;
		int num1=20, num2=60;
		if(num1>num2) {
			System.out.println("Max "+ num1);
		}
		else {
			System.out.println("Max "+num2);
		}
		
		
		// Example 2
		int age=20;
		int ticketPrice;
		ticketPrice= age>=16 ? 20: 10;
		System.out.println(ticketPrice);
		
		// Example 1
		int x=3;
		int y=0;
		 y= x>0 ? 1 : -1;
		System.out.println(y);
		
	}
}
