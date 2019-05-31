import java.util.Arrays;
import java.util.Scanner;

public class Replit3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// task 9
		System.out.println("Please ender multiple words");
		String[] str=new String[5];
		String str2="", str3;
		char chfirst, chlast;
		for(int i=0; i<str.length; i++) {
			str[i]=input.nextLine();
		}
		System.out.println(Arrays.toString(str));
		
		for(int i=0; i<str.length; i++) {
//			for(int j=0; j<str[i].length(); j++) {
//				str2=str[i];
//			}
//			chfirst=str2.charAt(0);
//			chlast=str2.charAt(str2.length()-1);
//			System.out.println(chfirst+chlast);
			System.out.println(str[i].substring(0, 1) + str[i].substring(str[i].length()-1));
		}
		
		
		
		
		// Task 8
//		System.out.println("Please sentences");
//		String str=input.nextLine();
//		String[] str2=str.split(" ");
//		
//		for(int i=str2.length-1; i>=0; i--) {
//			System.out.print(str2[i]+" ");
//			
//		}
//		System.out.println();
//		String[] str3=new String[str.length];
//		int count=0;
//		for(int j=str.length-1; j>=0; j--) {
//			//count++;
//			str3[count++]=str2[j];
//		}
//		System.out.println(Arrays.toString(str2));
		
//		String str=" Aidina";
//		String[] str2=str.split("i");
//		System.out.println(Arrays.toString(str2));
		
		
		// task 7
//		System.out.println("Please enter your email");
//		String str=input.nextLine();
//		String[] str2=str.split(" ");
//		
//		for(String i: str2) {   // for int i
//			System.out.println(i);
//		}
		
		
		// Task 6
//		System.out.println("Please enter your email");
//		String str=input.nextLine();
//		String[] str2=str.split("@");
//		System.out.println("id: "+str2[0]);
//		System.out.println("domain: "+str2[1]);
	
		
		// Task 5
//		String[] arr=new String[5];
//		for(int i=0; i<5; i++) {
//			arr[i]=input.nextLine();
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr.length);
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i].substring(0,3)+" ");
//		}
		
		//Task 4
//		String[] arr= {"one", "two", "three", "four"};
//		String[] arr2=new String[arr.length];
//		int count=0;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i].contains("e")) {
//				 arr2[count++]=arr[i];
//				System.out.println(arr[i]);
//			}
////			else {
////				arr2[count]=arr[i];
////			}
//		}
//		System.out.println(Arrays.toString(arr2));
		
		
		// Task 3 - Polindrom
//		String str=input.nextLine();
//		for(int i=0; i<str.length(); i++) {
//			for(int j=0; j<str.length(); j++) {
//				if(i==j) {
//					System.out.println("Polindrome");
//				}
//				else {
//					System.out.println("Not Polindrome");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		// Task 2  - Print unique charackter
//		String word=input.nextLine();
//		String ch="";
//		String str="";
//		for(int i=0; i<word.length(); i++) {
//			for(int j=i+1; j<word.length(); j++) {
//				if(word.charAt(i)==word.charAt(j)) {
//					ch=word.charAt(i)+"";
//					
//				}	
//			}
//		}
//		System.out.println(str);
					
		// Task 1
//		System.out.println("Please enter any word: ");
//		String word=input.nextLine();
//		
//		char ch=word.charAt(word.length()-1);
//		System.out.println(ch + word+ch);
	}
}
