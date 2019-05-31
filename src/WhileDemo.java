import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//Example 4
		int count=0;
		while(count<5) {
			System.out.println(count);
			count++;
		}
		System.out.println("After loop count : "+count);
		
		
		
		//Example 3
//		int number;
//		do {
//			System.out.println("Enter a whole number");
//			number=input.nextInt();
//			System.out.println("You entered number "+ number);
//		} while(number>0);
//		System.out.println("Number after loop: "+number);
		
		//Example 2
//		int count = 0; 
//		do {   
//			System.out.println(count);   
//			count++; 
//		} while (count < 0); 
//		System.out.println("count after loop = " + count);
		
//		int count=0;
//		while(count<5) {
//			System.out.println(count);
//			count++;
//		}
//		System.out.println("Count after loop: "+count);
		
		
		//Example 1
//		int count, number;
//		Scanner input=new Scanner(System.in);
//		System.out.println("Enter any number");
//		number=input.nextInt();
//		count=1;
//		
////		while(count<=number) {
////			System.out.print(count+", ");
////			count++;
////		}
//		
//		do {
//			System.out.print(count+ ",");
//			count++;
//		} while(count<=number);
//		
//		System.out.println();
//		System.out.println("Buckle my shoe");
		
	}
}
