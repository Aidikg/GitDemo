import java.util.*;

public class Replit2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		// Example 3
		int count=0;
		for(int i=1; i<=5; i++) {	
			for(int j=1; j<=i; j++) {
				count+=1;
				System.out.print(count+ " ");
			}
			System.out.println();
		}
		
		// Task 1 -> num
//		System.out.println("Please enter rows");
//		int num=input.nextInt();
//		int count=0;
//		for(int i=1; i<=num; i++) {
//			for(int j=1; j<=i; j++) {
//				count+=1;
//				System.out.print(count+ " ");
//			}
//			System.out.println();
//		}
	
		
		
		// Guest list
//		String ans="";
//		String name, list="";
//		
//		do {
//			System.out.println("Please enter name: ");
//			name=input.nextLine();
//			System.out.println("Do you want to enter new guest name: ");
//			ans=input.nextLine();
//			list+=name+" ,";
//			
//		}while(ans.equals("yes"));
//		String str2=list.substring(0, list.length()-1);
//		
//		System.out.println("Guest's list: "+str2);
		
		
		
		// Example Vowel or Constant
//		System.out.println("Please enter just one character");
//		String ch=input.next().toLowerCase();
//		String alph="qwertyuiopasdfghjklzxcvbnm";
//		String str;
//		
//		if(ch.length()>1 || !ch.contains(alph)) {      //  || !ch.contains(alph)
//			System.out.println("Error");
//		}
//		else {
//			if(ch.equals("a") || ch.equals("e") || ch.equals("o") || ch.equals("u") || ch.equals("y") || ch.equals("i")) {
//				System.out.println("Vowel");
//			}
//			else {
//				System.out.println("Consonant");
//			}
//		}
		
		
	}
}
