package arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		int[] val= {2, 10, 6, 8, 34, 89, 65, 80, 3, 9, 29};
		int vals=29;
		int pos=0;
		boolean found=true;
		//System.out.println(found);
		while(pos<val.length && found) {
			if(val[pos]==vals) {
				found=false;
			}
			else {
				pos++;
			}
		}
		if(!found) {
			System.out.println("Found at position "+pos);
		}
		else {
			System.out.println("Not Found");
		}
		
		
		// Example 5 -> Element Separator
//		int[] val= {10, 30, 69, 29};
//		
//		for(int i=0; i<val.length; i++) {
//			if(i>0) {
//				System.out.print(" | ");
//			}
//			System.out.print(val[i]);
//		}
	
		
		// Example 4 -> Largest Value
//		int[] val= {10, 7, 19, 2, 6};
//		int largest=val[0];
//		
//		for(int i=1; i<val.length; i++) {
//			if(largest<val[i]) {
//				largest=val[i];
//			}
//		}
//		
//		System.out.println(largest);
		
		
		// Example 3 - Sum of index and Value
//		int[] val= {5,10,15,20,25};
//		int total=0;
//		int sum=0;
//		
//		for(int i=0; i<val.length; i++) {
//			total+=val[i];
//			sum+=i;
//		}
//		System.out.println("Sum of Value: "+total);
//		System.out.println("Sum of Index: "+sum);
		
		// Example2
//		int[] prime=new int[5];
//		for(int i=0; i<5; i++) {
//			prime[i]++;
//			//prime[i]=i;
//		}
//		System.out.println(Arrays.toString(prime));
		
		// Example 1
//		double[] val=new double[5];
//		int count=0;
//		
//		while(count<val.length) {
//				val[count]=in.nextDouble();
//				count++;	
//		}
//		System.out.println(Arrays.toString(val));
		
		
	}
}
