package loops;

import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
		
		String name="techtorial";
		String space="";
		
		for(int num=0, len=name.length(); num<=len; num++, len--) {
			System.out.println(space+name.substring(num, len));
			space+=" ";
		}
		
    
		
		
		
		
		// Reverse Word
//		Scanner input=new Scanner(System.in);
//		System.out.println("Please enter any word");
//		String str=input.nextLine();
//		String rev="";
//		
//		for(int i=str.length()-1; i>=0; i--) {
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);
	}
}
