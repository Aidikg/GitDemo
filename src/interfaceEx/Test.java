package interfaceEx;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
//		Iphone ip=new Iphone();
//		ip.call(7736064);
//		System.out.println(ip.faceID());
//		ip.hi();
//		ip.location();
//		
//		Samsung sam=new Samsung();
//		sam.hi();
//		System.out.println(sam.faceID());
		
		Memory m1=new Iphone();
		m1.faceID();
		System.out.println(m1.faceID());
		
//		Phone p1=new Iphone();
//		((Memory)p1).location();
		
	
	//	Map<String, Integer> map1=new HashMap<>();
		
		
		//((Samsung)m1).call(888); // need casting
		
	}
}
