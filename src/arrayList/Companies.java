package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Companies {
	public static void main(String[] args) {
		
		List<String> comp=new ArrayList<>();
		System.out.println("Is the companies list empty "+comp.isEmpty());
		comp.add("Google");
		comp.add("Amazon");
		comp.add("Facebook");
		System.out.println("The best companies: "+ comp);
		
		System.out.println("Top companies size is "+ comp.size());
		String best1=comp.get(0);
		String best2=comp.get(1);
		
		System.out.println(best1+" "+best2);
		comp.set(1, "Twitter");
		System.out.println(comp);
		
	}
}
