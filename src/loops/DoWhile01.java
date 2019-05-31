package loops;

import java.util.Scanner;

public class DoWhile01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String name, list="";
		String ans;
		
//		do {
//			System.out.println("Enter your first name");
//			name=input.nextLine();
//			list=list+name+"\n";
//			System.out.println("Are you last student: yes-no");
//			ans=input.nextLine().toLowerCase();
//		}while(ans.equals("no"));
//		
//		System.out.println(list);
		
		// Second way
		do {
			System.out.println("Enter your first name");
			name=input.nextLine();
			list=list+name+"\n";
			System.out.println("Are you last student: yes-no");
			ans=input.nextLine().toLowerCase();
			
			if(ans.equalsIgnoreCase("Yes")) {
				break;
			}
			
		} while(true);
		System.out.println(list);
	}
}
