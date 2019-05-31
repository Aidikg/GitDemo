package arrays;

import java.util.Scanner;

public class UniqueNumberArrays {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] num=new int[4];
		int x=0;
		
		// Enter number
		System.out.println("Please enter 4 numbers");
		for(int i=0; i<num.length; i++) {
			num[i]=input.nextInt();
		}
		
		//Find unique numbers
		for(int i=0; i<num.length; i++) {
			boolean isDup=false;
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					isDup=true;
					break;
				}
			}
			if(!isDup) {
				System.out.println("Unique numbers: "+num[i]+" ");
			}
		}
		
		
	}
}
