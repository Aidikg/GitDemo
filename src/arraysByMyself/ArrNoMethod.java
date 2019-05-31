package arraysByMyself;

import java.util.Scanner;

public class ArrNoMethod {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many days tempr");
		int days=input.nextInt();
		int[] temps=new int[days];
		
		// Input and store temps in the array
		for(int i=0; i<temps.length; i++) {
			System.out.println("Day "+i+" 's high temp:");
			temps[i]=input.nextInt();
		}
		
		// Calsulate and print the average
		int sum=0;
		for(int i=0; i<temps.length; i++) {
			sum+=temps[i];
		}
		
		// Average of temp
		double average=(double) sum/temps.length;
		System.out.println("Average temp= " +average);
		
		// Count the number of values that were above average
		int count=0;
		for(int i=0; i<temps.length; i++) {
			if(temps[i]> average) {
				count++;
			}
		}
		System.out.println(count+ " days were above average");
	}
}
