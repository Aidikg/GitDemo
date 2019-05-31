package loops;

import java.util.Scanner;

public class LoopString {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		// Example 7
		for(int x=0; x<=3; x++) {
			for(int y=0; y<=x; y++) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//Example 6
//		for(int x=0; x<=10; x+=2) {
//			System.out.println(x);
//		}
		
		// Example 5
//		for(double test=0; test<=3; test=test+0.5) {
//			System.out.println(test);
//		}
		
		// Example 4
//		for(int n=1; n<=4; n++) {
//			System.out.print(n+" ");
//		}
//		System.out.println();
//		System.out.println("Reverse");
//		for(int x=4; x>0; x--) {
//			System.out.print(x+" ");
//		}
		
//		int sum=0;
//		for(int x=1; x<=10; x++) {
//			sum=sum+x*x;
//			System.out.println(sum);
//		}
//		System.out.println(sum);
		
//		int product=1, num;
//		for(num=1; num<=10; num++) {
//			product=product*num;
//		}
//		System.out.println(product);
//		
		// what is difference between
//		int num;
//		int sum=0;
//		for(num=1; num<=10; num++) {
//			num=num*num; 
//			sum=sum+num;
//			System.out.println(num);
//		}
//		System.out.println(sum);
		
		//Example 4
//		System.out.println("Please enter two numbers");
//		int num1=input.nextInt();
//		int num2=input.nextInt();
//		
//		if(num2>num1) {
//			for(int i=num1; i<=num2; i++) {
//				System.out.println(i);
//			}
//		}
//		else {
//			for(int i=num2; i>=num1; i--) {
//				System.out.println(i);
//			}
//		}
		
		// Example 3
//		System.out.println("Enter word");
//		String word=input.nextLine();
//		System.out.println("Enter character");
//		char ch=input.next().charAt(0);
//		int count=0;
//		
//		for(int i=0; i<=word.length()-1; i++) {
//			if(ch==word.charAt(i)) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		
		//Example 2 Reverse
//		String str="banana";
//		//String r="";  //variant 2
//		for(int i=str.length()-1; i>=0; i--) {
//			//r+=str.charAt(i); //variant 2
//			char r=str.charAt(i);
//			System.out.print(r);
//		}
//		//System.out.println(r); // variant 2
		
		// Example 1
//		String fruit="banana";
//		for(int i=0; i<=fruit.length()-1; i++) {
//			char letter=fruit.charAt(i);
//			System.out.println(letter);
//		}
	}
}
