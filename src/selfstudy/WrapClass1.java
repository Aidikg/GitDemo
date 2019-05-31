package selfstudy;

public class WrapClass1 {
	public static void main(String[] args) {
		
		// Wrapper to Primitive
		Integer num=new Integer(10);
		int num2=num.intValue();
		int num3=num;
		System.out.println(num+" "+num2+" "+num3);
		System.out.println(num+num2+num3);
		
		// Primitive to Wrapper
		int a=20;
		Integer i=Integer.valueOf(a);
		Integer j=a;
		System.out.println(a+" "+i+" "+j);
		System.out.println(a+i+j);
	
	}
}
