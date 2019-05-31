

import java.util.*;

public class Task02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int scana=0, randb;
		randb=rand.nextInt(100);
		boolean guess=true;
		int count=1;
	
		do {	
			System.out.println("Guess number");
			scana=scan.nextInt();
			
			if(scana<randb) {
				System.out.println("Your number is low");
			}
			else if(scana>randb){
				System.out.println("your number is high");
			}
			
			else {
				System.out.println("Congratuulations");
			}
			
		}while(scana!=randb && count<=3);
		
		System.out.println("Random number is: "+randb);
		}
	
}
