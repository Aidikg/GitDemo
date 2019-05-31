package arraylist2;

import java.util.ArrayList;

public class Example2 {
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<>();
		names.add("kate");
		names.add("john");
		names.add("james");
		names.add("sarah");
		
		System.out.println(names);
		
		ArrayList<String> rev=new  ArrayList<>();
		for(int i=names.size()-1; i>=0; i--) {
			rev.add(names.get(i));
		}
		System.out.println(rev);
		
		
	}
}
