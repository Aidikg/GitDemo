package arraysByMyself;

public class TestArrays {
	public static void main(String[] args) {
		ArrWithMethod method=new ArrWithMethod();
		
		// Sum of Values 
		int[] num= {1,7,9,10};
		System.out.print("Sum of Values: ");
		System.out.println(method.sum4(num));
		
		// Sum of index
		int[] numind= {1,7,9,10};
		System.out.print("Sum of index: ");
		System.out.println(method.sum3(numind));
		
		
		// Example with toCharArray
		String name="Kurmanbek";
		System.out.println(method.toCharArray("Char of name: "+name));
		
		
		//Example 1
		double[] ex1d= {1.3, 2.6, 6.8};
		System.out.print("Total of Double: ");
		System.out.println(method.sumArr(ex1d));
	}
}
