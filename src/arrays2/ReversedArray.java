package arrays2;

import java.util.Scanner;

public class ReversedArray {
	public static double[] readIn(int num) {
		System.out.println("Enter "+num +" numbers");
		Scanner in=new Scanner(System.in);
		double[] inputs=new double[num];
		
		for(int i=0; i<inputs.length; i++) {
			inputs[i]=in.nextDouble();
		}
		return inputs;
	}
	
	public static void multiply(double[] val, double factor) {
		for(int i=0; i<val.length; i++) {
			val[i]=val[i]*factor;
		}
	}
	
	public static void printRev(double[] val) {
		for(int i=val.length-1; i>=0; i--) {
			System.out.print(val[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		double[] numbers=readIn(5);
		multiply(numbers, 10);
		printRev(numbers);
		
	}
	
}
