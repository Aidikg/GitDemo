package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Friday1 {
	// storeNum method
	public static List<Integer> storeNum(){
		List<Integer> list=new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			Random rnd=new Random(100);
			list.add(rnd.nextInt());
		}
		return list;
	}
	
	// sortNum method
	public static Set<Integer> sortList(){
		Set<Integer> intSet=new TreeSet<>();
		intSet.addAll(storeNum());
		return intSet;
	}
	
	// Verification Method
	public static void verification() {
		List<Integer> listOfNum=new ArrayList<>();
		listOfNum.addAll(sortList());
		int number=1;
		
		for(int i=0; i<listOfNum.size(); i++) {
			
			try {
				if(listOfNum.get(i) < listOfNum.get(i+1)) {
					number++;
				}
				else {
					throw new RuntimeException("Verification Failed");
				}
			} catch(RuntimeException ex) {
				System.out.println("Your verification because of some alghoritm issues");
			}
			if(number==listOfNum.size()) {
				System.out.println("Verification Passed");
			}
		}
	}
	
	public static void main(String[] args) {
		
		verification();
		
	}

}
