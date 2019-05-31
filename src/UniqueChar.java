import java.util.Scanner;

public class UniqueChar {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter word ");
		String word=input.nextLine().toLowerCase().trim();
		word=word.replace(" ", "");
		String temp="";
		
		int len=word.length();
		
		for(int i=0; i<len; i++) {
			if(temp.indexOf(word.charAt(i))==-1) {
				temp=temp+word.charAt(i);
			}
		}
		System.out.println(temp);
		
	}
}
