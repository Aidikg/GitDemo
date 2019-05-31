package loops;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What type of car you have? ");
		String str=input.nextLine().toLowerCase().trim();
		
		switch(str) {
		case "car":
			System.out.println("You will charged 1 $");
			break;
		case "bus":
			System.out.println("You will charged 2 $");
			break;
		case "truck":
			System.out.println("You will charged 5 $");
			break;
		default:
			System.out.println("Out of list");
		}
		
	}
}
