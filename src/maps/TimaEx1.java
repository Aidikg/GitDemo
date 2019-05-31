package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class TimaEx1 {
	public static List<String> strArr(String strIn){
		String[] strArr=strIn.split(" ");
		List<String> str=Arrays.asList(strArr);
		Collections.sort(str);
		System.out.println(str);
		System.out.println("Length: "+str.size());
		return str;
	}
	
	public static ArrayList<Integer> arrayList(){
		Random r=new Random();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0; i<50; i++) {
			list.add(r.nextInt());
		}
		return list;
	}
	
	public static Map<String, Integer> mapIn(List<Integer> list1, List<String> list2){
		Map<String, Integer> map=new HashMap<>();
		for(int i=0; i<50; i++) {
			map.put(list2.get(i), list1.get(i));
		}
		System.out.println(map);
		return map;
	}
	
	public static void main(String[] args) {
		
		String strFin="Hakamada  is Russian journalist, publicist and politician who ran in the 2004 Russian "
				+ "presidential election. "
				+ "Candidate of Economic Sciences, writer, television and radio host. Deputy of the State "
				+ "Duma of three convocations "
				+ ""
				+ "(1993–2003), co-chairman of the political party, Union of Right Forces (1999–2003), p"
				+ "residential candidate of "
				+ "the"
				+ " Russian Federation (2004), "
				+ "member of the Presidential Council for the Development of Civil Society and Human Rights "
				+ "(2012— 2018).";
		strArr(strFin);
		mapIn(arrayList(), strArr(strFin));
		List<String> newAlist=strArr(strFin);
		newAlist=new ArrayList<>();
		
		ArrayList<Integer> at=arrayList();
		at.clear();
		boolean n=at.isEmpty();
		boolean m=newAlist.isEmpty();
		
		try {
			if(n==true && m==true) {
				System.out.println("TRUE");
			}
		}
		catch(RuntimeException ex) {
			System.out.println("FALSE");
		}
		System.out.println(n);
		System.out.println(m);
	}
	

}
