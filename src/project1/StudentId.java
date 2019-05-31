package project1;

import java.util.Arrays;
import java.util.Scanner;

public class StudentId {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your id");
		int[] arr= new int[10];
		int num, num2;
		int count=0;
		
		
		for(int i=0; i<1; i++) {
			arr[i]=input.nextInt();
			for(int j=0; j<5; j++) {
				arr[j]=input.nextInt();
				if(arr[i]==arr[j]) {
					System.out.println("Try Again");
				}
				else {
					arr[i]=arr[j];
				}
			}
		}
	
			
		System.out.println(Arrays.toString(arr));	
	}
	
}

//if(num==arr[i]) {
//	count++;
//	System.out.println("Try two more times");
//	for(int j=0; j<2; j++) {
//		num2=input.nextInt();
//		if(num2==num) {
//			count++;
//		}
//		if(count==3) {
//			break;
//		}
//		
//	}