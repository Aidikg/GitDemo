package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Example1 {
	public static void main(String[] args) {
				
		// String
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Audi");
		cars.add("Mazda");
		cars.add("BMW");
		
		for(int i=0; i<cars.size(); i++) {   // doesnt work with length
			System.out.print(cars.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("With for-each");
		for(String i: cars) {
			System.out.print(i+" ");
		}
		
		// Integer
//		ArrayList<Integer> myNum=new ArrayList<Integer>();
//		myNum.add(10);
//		myNum.add(2);
//		myNum.add(25);
//		myNum.add(8);
//		Collections.sort(myNum);
//		for(int i: myNum) {
//			System.out.println(i);
//		}
		
//		String name="Aidina";
//		String result="";
//		for(int i=0; i<name.length(); i++) {
//			
//		//	System.out.println(i);
//			
//			System.out.println(name);
//			
////			result+=name.charAt(i);
////			System.out.println(result);
//			
//		}
		
//		int num=5;
//		for(int i=0; i<num; i++) {
//			System.out.println(i);
//			//System.out.println(num);
//		}
		
	}
}
