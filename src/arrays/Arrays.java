package arrays;

import java.util.Scanner;

public class Arrays {
	int a=16;
	
	
	public static void main(String[] args) {
		int b=10;
		b=29;
		
		Scanner input=new Scanner(System.in);
		int[] tempr=new int[7];
		// Example 3
		System.out.println("Enter 7 temperatures");
		for (int index=0; index<tempr.length; index++) {
			tempr[index]=input.nextInt();
		}
		System.out.println("The 7 temperatures are: ");
		for(int i=0; i<tempr.length; i++) {
			System.out.print(tempr[i]+" ");
		}
		
		
		//Example 2 int-arrays
//		int[] num=new int[5];
//		num[0]=5;
//		num[1]=2;
//		num[2]=10;
//		num[3]=55;
//		num[4]=0;
//		int sum=0;
//		
//		for(int i=0; i<num.length; i++) {
//			sum=sum+num[i];
//		}
//		System.out.println(sum);
		
		
		// Example 1 -Kolay
//		String[] fruits= {"apple", "banana", "orange"};
//		System.out.println(fruits.length);
//		for(int x=0; x<fruits.length; x++) {
//			System.out.println(fruits[x]);
//		}
	}


	

}
