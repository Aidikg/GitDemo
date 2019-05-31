package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Picnic {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	       // if person wanna come to picnic ad his/her name to the list
		ArrayList<String> names=new ArrayList();
		System.out.println("Please enter five names to picnik list");
		
		for(int i=0; i<5; i++) {
			names.add(input.nextLine());
		}
		System.out.println();
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
	    // after adding person to the list if he/she doesn’t wanna 
		//come anymore delete person from list.
		System.out.println("Remove first index");
		names.remove(0);
	       // if you wanna replace the person with another person you should be able 
		   // to replace the person from list.
		System.out.println("Replace second index to Kate");
		names.set(1, "Kate");
	       // If you wanna see the all list. You should be able to print all of them.
		System.out.println();
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
	       // if you wanna check the person is coming to the picnic or not
		System.out.println("Is There James");
		boolean ans=names.contains("James");
		System.out.println(ans);
	       // Sort the persons with alphabetical order
		Collections.sort(names);
		System.out.print(names+" ");

	       //0 - add
	       //1 - remove
		
	}
}
