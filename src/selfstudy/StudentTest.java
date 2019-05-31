package selfstudy;

import java.util.Scanner;

public class StudentTest {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str="hello";
	String result="";
	int count=0;
	for(int i=0; i<str.length(); i+=2) {
		//result+=str.charAt(i);
		result+=str.substring(i, i+1);
	}
	System.out.println(result);
	
//	System.out.println("Please enter word");
//	String str=scan.nextLine();
//	System.out.println("Please enter num to cut");
//	int n=scan.nextInt();
//	String str1, result="";
//	
//	if(str.length()>=3) {
//		str1=str.substring(0,3);
//		for(int i=0; i<n; i++) {
//			result+=str1;
//		}
//		System.out.println(result);
//	}
//	else {
//		System.out.println(str);
//	}
	
	
//	String str=scan.nextLine();
//	 String str1="";
//	 int num=scan.nextInt();
//	 
//	 for(int i=0; i<num; i++) {
//		 str1+=str;
//		 
//	 }
//	 System.out.println(str1);
	 
	 
	 
	 
	  
//	  if(str.length()>=3){
//	    if(str.substring(0,3).equals(str1)){
//	     System.out.println(str); 
//	    }
//	    if(str.equals(str1)){
//	        System.out.println(str);
//	    }
//	  }
//	  else {
//	System.out.println("not"+str);
//	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Scanner input=new Scanner(System.in);
//	String str=input.nextLine();
//	int n=input.nextInt();
//	char ch;
//	int count=0;
//	if(n==2) {
//		for(int i=0; i<=str.length(); i+=2) {
////			count++;
//			ch=str.charAt(i);
//			System.out.println(ch);
//			//System.out.println(i);
//		}
//	}


}
}
