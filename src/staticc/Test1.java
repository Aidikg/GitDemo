package staticc;

public class Test1 {
	static int num;     // by default it is 0
	static int count=0;
	Test1(){
		count++;
		System.out.println(count);
	}
	
	
	// With Instance Variable
//	int count=0;
//	Test1(){
//		count++;
//		System.out.println(count);
//	}
	
	public static void main(String[] args) {
		Test1 c1=new Test1();
		Test1 c2=new Test1();
		Test1 c3=new Test1();
		Test1 c4=new Test1();
		System.out.println(c4.num);
		
		// with instance Variable
//		Test1 c1=new Test1();
//		Test1 c2=new Test1();
//		Test1 c3=new Test1();
	}
}
