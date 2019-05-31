package loops;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String ans;
		int sum=0;
		do {
			System.out.println("enter number");
			int num=input.nextInt();
			System.out.println("Do you want to continue: ");
			ans=input.next().toLowerCase();
			
		
			
		} while(ans.equals("y"));
		
	
		
//		System.out.println("Please enter words");
//		String str=input.nextLine();
//		int len=str.length();
//		
//		if(len<3 && len>100) {
//			System.out.println("Invalid Number");
//		}
		
		
		// Task1
//		System.out.println("Enter positive number");
//		int num=input.nextInt();
//		
//		for(int x=1; x<=num; x++) {
//			if(x%2==0 && x%3==0) {
//				int result=x*x;
//				System.out.println(result+" ");
//			}
//		}
	}
}
