package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAll {
	public static void main(String[] args) {
		
		ArrayList<String> str=new ArrayList<>();
		str.add("table");
		str.add("computer");
		str.add("pen");
		str.add("coffee");
		System.out.println(str);
		System.out.println("Size of str "+str.size());
		
		System.out.println("Index of pen "+str.indexOf("pen"));
		
		for(int i=0; i<str.size(); i++) {
			System.out.println("Item "+i+" is "+str.get(i));
		}
		System.out.println("ArrayList contains car: "+str.contains("car"));
		System.out.println("ArrayList is Empty: "+str.isEmpty());
		
		str.set(0, "bottle");
		System.out.println(str);
		
		System.out.println("Converting ArrayList to Array ");
		
		//String[] arr=new String[str.size()];
		String[] arr=str.toArray(new String[0]);
		System.out.println(Arrays.toString(arr));
	
	}
}
