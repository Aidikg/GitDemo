package arraylist2;

import java.util.HashSet;

public class HashSetEx1 {
	
	public static void printSet(HashSet<Integer> intSet) {
		System.out.println("The set contains: ");
		for(Integer element: intSet) {
			System.out.println(element);
		}
//		for(Object obj: intSet.toArray()) {
//			Integer num=(Integer) obj;
//			System.out.println(num.intValue());
//		}
	}
	
	public static void main(String[] args) {
		
		HashSet<Integer> intSet=new HashSet<>();
		intSet.add(2);
		intSet.add(7);
		intSet.add(7);
		intSet.add(9);
		intSet.add(3);
		
		printSet(intSet);
		intSet.remove(3);
		printSet(intSet);
		
		System.out.println("Set contains 2: "+intSet.contains(2));
		System.out.println("Set contains 3: "+intSet.contains(3));
		
	}
}
