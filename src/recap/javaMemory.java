package recap;

public class javaMemory {
	public static void main(String[] args) {
		String str1="apple";
		String str2="apple";
		String str3=new String("apple");
		String str4=new String("apple");
		
		System.out.println(str1==str2);  // String Pool
		System.out.println(str1==str3);  // Heap
		
		System.out.println(str1.equals(str3));  // comparing value
		System.out.println(str3==str4);  // comparing variable name(obj_name)
		System.out.println(str1.equals(str4));
	}
}
