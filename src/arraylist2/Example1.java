package arraylist2;

import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) {
		
		// Array
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i*i;
		}
		System.out.println("Arrays");
		System.out.println(Arrays.toString(arr));
		
		
		// ArrayList
		ArrayList<Integer> sq=new ArrayList<>();
		for(int i=0; i<10; i++) {
			sq.add(i*i);
		}
		
		System.out.println("ArrayList");
		System.out.println(sq);
		
		
//		ArrayList<String> names=new ArrayList<>();
//		names.add("Ann");
//		names.add("Cindy");
//		System.out.println(names);
//		
//		names.add(1, "Bob");
//		names.remove(0);
//		names.set(0, "Bill");
//		String name=names.get(1);
//		System.out.println(name);
//		String last=names.get(names.size()-1);
//		System.out.println(last);
	
	}
}
