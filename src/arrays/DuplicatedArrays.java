package arrays;
import java.util.Arrays;

public class DuplicatedArrays {
	public static void main(String[] args) {
		// Example 3
//		String[] name= {"hello", "bye", "thanks"};
//		String str2="", str3="";
//		
//		for(int i=name.length-1; i>=0; i--) {
//			//System.out.print(name[i]+", ");	
//			str2+=name[i]+", ";
//		}
//		System.out.println(str2);
//		
//		str3=str2.substring(0, str2.length()-2);
//		System.out.println(str3);
		
		
		
		// Example 2
		String[] str= { "apple","cat","kat"};
	    String[] str1=new String[str.length];
	    System.out.println(Arrays.toString(str));
	    int b=0;
	    for(int i =str.length-1;i>=0 ;i--) {
	    str1[b++] = str[i];
	    }
	    System.out.println();
	    System.out.println(Arrays.toString(str1));
		
		//String str2=name[i].substring(0, name[i].length()-2);
		
		//Example 1
//		String[] str= {"apple", "bird", "apple", "bird", "city"};
//		//int count=0;
//		
//		for(int i=0; i<str.length; i++) {
//			
//			//String duplicate=str[i];
//			
//			for(int j=i+1; j<str.length; j++) { 
//				
//				if(str[i].equals(str[j])) { //duplicate.equals()
//					
//					System.out.println("Duplicated "+str[i]);	 //duplicate
//				}	
//			}
//		}
		
		
	}
}
