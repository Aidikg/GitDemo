package inheritance;

class Calculation{
	int z;
	public void add(int x, int y) {
		z=x+y;
		System.out.println("The sum of the given numbers: "+z);
	}
	
	public void sub(int x, int y) {
		z=x-y;
		System.out.println("The difference between given numbers "+z);
	}
}

public class My_Calc extends Calculation {
	public void multiplication(int x, int y) {
		z=x*y;
		System.out.println("The multiplication of the given numbers : "+z);
	}
	
	public static void main(String[] args) {
		int a=20, b=10;
		My_Calc demo=new My_Calc();
		demo.add(a, b);
		demo.sub(a, b);
		demo.multiplication(a, b);
	}
}
