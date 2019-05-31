package arrays;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		// int[] price=new int[5];
		Scanner input=new Scanner(System.in);
		
		String[] productName= {"Trident", "Pepsi", "Oreo"};
		String[] productNumber= {"01", "02","03"};
		int[] productPrice= {3,1,2};
		
		String num;
		int price;
		
		System.out.println("Enter the product Number");
		num=input.nextLine();
		
		for(int i=0; i<productName.length; i++) {
			if(productNumber[i].equals(num)) {
				System.out.println("Enter the product price: "+ productPrice[i]);
				price=input.nextInt();
				if(productPrice[i]==price) {
					System.out.println("Please enjoy the product "+productName[i]);
				}
			}
		}
		
	
//		
//		if(num==1) {
//			System.out.print("Price is: "+prodPrice[0]+" "+"Product Name is: "+prodName[0]);
//		}
//		if(num==2) {
//			System.out.print("Price is: "+prodPrice[1]+" "+"Product Name is: "+prodName[1]);
//		}
//		if(num==3) {
//			System.out.println("Price is: "+prodPrice[2]+" "+"Product Name is: "+prodName[2]);
//		}
//		System.out.println();
//		System.out.println("Enjoy");
	}
}
