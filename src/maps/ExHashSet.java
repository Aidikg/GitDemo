package maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExHashSet {
	public static void main(String[] args) {
		
	List<Integer> intList=new ArrayList<>();
	intList.add(10);
	intList.add(10);
	System.out.println("This is ArrayList "+intList);
	
	Set<Integer> intSet=new HashSet<>();
	intSet.add(100);
	intSet.add(100);
	System.out.println("This is HashSet "+intSet);
	
	Set<String> str=new HashSet<>();
	str.add("hello java");
	str.add("Hello World");
	System.out.println(str);
	if(str.add("hello java")) {
		System.out.println("Successfully added");
	}
	else {
		System.out.println("Sorry");
	}
//		str.removeAll(str);
//		System.out.println(str);
		
	}
}
