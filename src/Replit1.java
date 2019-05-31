import java.util.Scanner;

public class Replit1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		 int i, j, width, height;
		    String x;

		    System.out.print("Enter a character: ");
		    x = input.nextLine();
		    System.out.print("Enter a height: ");
		    height = input.nextInt();
		    System.out.print("Enter a width: ");
		    width = input.nextInt();

		    for(i = 1; i <=height; i++) {
		        for(j = 1; j <= width; j++) {
		            System.out.print(x);
		        }
		        System.out.println();
		    }
		
		
		
		//Task 9 - rectangle
//		System.out.println("Please enter positive number for Rectangle");
//		int n=input.nextInt();
//		for(int r=1; r<=n-1; r++) {
//			for(int x=1; x<=n; x++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//Task 8 half tree 
//		System.out.println("Please Enter any positive number");
//		int n=input.nextInt();
//		for(int r=1; r<=n; r++) {
//			for(int z=1; z<=r; z++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		System.out.println("Please enter positive number");
//		int num=input.nextInt();
//		//sinput.nextLine();
//		
//		for(int r=0; r<num; r++) {
//			for(int sp=num; sp>=r; sp--) {
//				System.out.print(" ");
//			}
//			for(int z=1; z<=r; z++) {
//				System.out.print("*");
//			}
//			for(int zv=0; zv<=r; zv++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// task 7
//		for(int x=0; x<=5; x++) {
//			for(int space=4; space>=x; space--) {
//				System.out.print(" ");
//			}
//			for(int z=1; z<=x; z++) {
//				System.out.print("*");
//			}
//			for(int zv=0; zv<=x; zv++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
		//task 6
//		Scanner input = new Scanner(System.in);
//		int ii = input.nextInt();
//		for (int i =1;i<=10;i++) {
//			System.out.println(ii+"X"+i+"="+i*ii);}
	
		//task5
//		int co=0;
//		for(int i =1 ;i<=19;i++) {
//			if (i%2!=0) {
//				co+=i;
//		System.out.print(co +" ");}}

		
		//task1
//		int i =1;
//		System.out.print(i);
//		for (i=2;i<=20;i++) {
//			System.out.print(" + "+i);
//		}
		
	
		
//task 4
//		int co=0;
//		for(int i = 1 ;i<=20;i++) {
//			if (i%2==0) {
//				co+=i;}}
//		System.out.println(co);
			
//		for (int i =1;i<=20;i++) {
//			i+="+";
//			String b = ii+"";
//			int l = b.length();
//			String d = b.substring(l,l-1);
//			System.out.print(d);
//		}
		
		
		
		//Example 3
//		for(int i=0; i<20; i++) {
//			if(i%2!=0) {
//				System.out.println(i*i);
			
		
		
		// Example 2
//		for(int i=0; i<=20; i++) {
//			if(i%3==0) {
//				System.out.println(i);
//			}
//		}
		
		//Example 1
//		for(int i=2; i<=20; i+=2) {
//			System.out.print(i+" ");
//		}
	}
}
