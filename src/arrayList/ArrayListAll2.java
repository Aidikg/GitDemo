package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListAll2 {
	
	
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<String> toDoList=new ArrayList<>();
		System.out.println("Enter list of to do");
		boolean done=true;
		
		while(done) {  // while it is true
			System.out.println("Type an entry");
			String entry=input.nextLine();
			toDoList.add(entry);
			System.out.println("More lists in to do list");
			String ans=input.nextLine();
			
			if(ans.equalsIgnoreCase("yes")) {
				done=true;
			}
			else {
				done=false;
			}
		}
		System.out.println("The lists contains");
		for(String i: toDoList) {
			System.out.println(i);
		}
//		for(int i=0; i<toDoList.size(); i++) {
//			System.out.println(toDoList.get(i));
//		}
		
		
		// Example 1
//		String[] arr= {"table", "pen", "coffee"};
//		System.out.println(arr);
//		System.out.println();
//		
//		System.out.println("Converting to ArrayList");
//		List<String> list=Arrays.asList(arr);
//		System.out.println(list);
////		list.add("phone");          // You CANNOT add because after converting to ArrayList size is fixed
////		System.out.println(list);
	}
}
