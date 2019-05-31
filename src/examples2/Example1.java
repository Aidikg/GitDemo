package examples2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	private String name="Static class";
	public static void first() {};
	public static void second() {};
	public void third() {
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		first();
		second();
	//	third();  // Cannot Compile
		
		Example1 obj=new Example1();
		obj.third();
		
		
		
		
		
		
		
		
		// asList()
//		String[] arr= {"hawk", "robin"};
//		List<String> list=Arrays.asList(arr);
//		System.out.println(arr);
//		System.out.println("Array "+ Arrays.toString(arr));
//		System.out.println("List: "+list);
		
		// toArray()
//		List<String> list=new ArrayList<>();
//		list.add("hi");
//		list.add("bye");
//		System.out.println(list);
//		
//		Object[] arr=list.toArray();
//		System.out.println(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(list);
		
		
//		int primitive=Integer.parseInt("123");
//		Integer wrapper=Integer.valueOf("123");
//		
//		
//		System.out.println(primitive+10);
//		System.out.println(wrapper+10);
		
//		ArrayList list1=new ArrayList();
//		list1.add("hello");
//		list1.add(10);
//		list1.add(Boolean.TRUE);
//		System.out.println(list1);
	
//		int[] num=new int[6];
//		
//		for(int i=0; i<num.length; i++) {
//			num[i]=i+5;
//			System.out.println(num[i]);
//		}
		
		
		
//		StringBuilder str=new StringBuilder();
//		for(char ch='a'; ch<='z'; ch++) {
//			str.append(ch);
//			//System.out.println(str);
//		}
//		System.out.println(str);
		
		
		
//		String alpha="";
//		for(char current='a'; current<='z'; current++) {
//			alpha+=current;
//			//System.out.println(alpha);
//		}
//		System.out.println(alpha);
	
//		String s1="1";
//		String s2=s1.concat("2");
//		s2.concat(s1);
//		//String s3=s2.concat("3");
//		System.out.println(s2);
	}
}
