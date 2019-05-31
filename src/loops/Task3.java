package loops;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String ans;
		int num, pos=0, zer=0, neg=0;
		int count=0;
		do {
			System.out.println("Enter number");
			num=input.nextInt();
			System.out.println("Do you want to continue");
			input.nextLine();
			ans=input.nextLine();
			
			if(num>0) {
				pos++;
			}
			else if(num==0) {
				zer++;	
			}
			else{
				neg++;	
			}
			
		} while(ans.equals("y"));
		System.out.println("Positive: "+pos);
		System.out.println("zero: "+zer);
		System.out.println("negative: "+neg);
	}
}
