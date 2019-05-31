package examples2;

public class ReturnVal {
	
	private final int volume;
	private final String name="The Mouse";
	public  ReturnVal(int l, int w, int h) {
		volume=l*w*h;
	}
	public static void main(String[] args) {
		ReturnVal r=new ReturnVal(2,3,5);
		System.out.println(r.volume);
		ReturnVal r2=new ReturnVal(4,6,8);
		System.out.println(r2.volume);
	}
	
	
//	public void fly(int i) {
//		System.out.println("int");
//	}
//	public void fly(long l) {
//		System.out.println("long");
//	}
//	
//	public static void main(String[] args) {
//		ReturnVal r=new ReturnVal();
//		r.fly(123);
//		r.fly(123L);
//	}
	
//	public static int number(int num) {
//		num++;
//		return num;	
//	}
//	public static String letter(String letters) {
//		letters+="d";
//		return letters;
//	}
//	public static void main(String[] args) {
//		int num=1;
//		String letters="abc";
//		number(num);
//		letters=letter(letters);
//		System.out.println(num+letters);
//		System.out.println(number(num));
//	}
}
