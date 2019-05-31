package arrayList;

import java.util.ArrayList;

public class ReturnType {
	public static ArrayList<Integer> copy(ArrayList<Integer> a){
		ArrayList<Integer> b=new ArrayList<>();
		for(int i=0; i<a.size(); i++) {
			b.add(a.get(i));
		}
		return b;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> aa=new ArrayList<>();
		aa.add(10);
		aa.add(30);
		aa.add(56);
		ReturnType obj=new ReturnType();
		System.out.println(obj.copy(aa));
		
		
//		ArrayList<Integer> a1=new ArrayList<>();
//
//		ReturnType obj=new ReturnType();
//		a1=obj.copy(aa);
//		System.out.println(a1.toString());
	}
}
