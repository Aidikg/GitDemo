package warmup;

public class MathHelpTest {
	public static void main(String[] args) {
		MathHelp mathhelp=new MathHelp();
		
		System.out.println(mathhelp.sum(2, 7));
		System.out.println(mathhelp.multiple(3, 6));
		System.out.println(mathhelp.divide(18, 2));
		System.out.println(mathhelp.substract(45, 25));
		
		mathhelp.a=40;
		mathhelp.b=69;
		System.out.println(mathhelp.noParameter());
		mathhelp.divide(7, 8);
		mathhelp.substract(9, 8);
		
	}
}
