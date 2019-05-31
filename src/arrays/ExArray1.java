package arrays;

import java.util.Scanner;

public class ExArray1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("How may temperatures do you have?");
		int size=input.nextInt();
		
		double[] temper=new double[size];
		System.out.println("Enter "+ temper.length+" temperatures");
		double sum=0;
		for(int i=0; i<temper.length;i++) {
			temper[i]=input.nextDouble();
			sum+=temper[i];
		}
		double average=sum/temper.length;
		System.out.println("The average temperature is "+average);
		
		System.out.println("The temperaures are ");
		for(int i=0; i< temper.length; i++) {
			if(temper[i]<average) {
				System.out.println(temper[i]+ " below average ");
			}
			else if(temper[i]>average) {
				System.out.println(temper[i]+" above average");
			}
			else {
				System.out.println(temper[i]+" equal to the average ");
			}
		}
		System.out.println("Have a nice week. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
