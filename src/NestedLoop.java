import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		// Task - 1
		int num=input.nextInt();
		for(int x=0; x<=num; x++) {
			if(x%2!=0) {
				System.out.print(x+" ");
			}
			
		}
		
	}
	
}
