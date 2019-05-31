package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Picnic01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<String> names=new ArrayList();
		
		System.out.println("What would you like to do: ");
		System.out.println("0:Add, 1:Remove, 2:Replace, 3:All List, 4: Check ");
		int ans=input.nextInt();
		
		String ad;
		input.nextLine();
		int ind;
		
		if(ans==0) {
			System.out.println("You can add Five person");
			for(int i=0; i<5; i++) {
				ad=input.nextLine();
			}
			
		}
		
	//	input.nextLine();
		System.out.println("What would you like to do: ");
		System.out.println("0:Add, 1:Remove, 2:Replace, 3:All List, 4: Check ");
		ans=input.nextInt();
		if(ans==1) {
			System.out.println("You can delete given index number");
			ind=input.nextInt();
			names.remove(ind);
			System.out.println(names);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
