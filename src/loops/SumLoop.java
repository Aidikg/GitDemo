package loops;

import java.util.Scanner;

public class SumLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		boolean areMore=true;
		int sum=0;
		System.out.println("Enter positive number");
		System.out.println("after enter negative number");
		while(areMore) {
			
			int next=scan.nextInt();
			if(next<0) {
				areMore=false;
			}
			else {
				sum=sum+next;
			}
		}
		System.out.println("The sum of num: "+sum);
	}
}
