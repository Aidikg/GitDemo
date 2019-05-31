package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringManipulation {
	// The same Example LongWord - Tima
	public static String cutWord(int num, String str) {
		String cut="";
		int count=0; 
		
		if(str.length()>num) {
			while(str.length()>=num) {
				str=str.substring(0, str.length()-1);
				count++;
			}
			System.out.println(str+" and we iterated "+ count +" times");
			return str;
		}
		else {
			System.out.println("Your string too short");
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		cutWord(14,"WeHaveBeenGoingOverWhileLoop");
		
		// LongWord -Bek
//		String word="WeHaveBeenGoingOvertr";
//		String cut="";
//		int count=0;
//		int i=word.length();
//		while(i>=10) {
//			cut=word.substring(0,i);
//			i--;
//			count++;
//		}
//		System.out.println("Aftetr cut: "+cut);
//		System.out.println("Count is "+count);
	}
}
