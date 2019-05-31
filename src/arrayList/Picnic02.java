package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Picnic02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> picnic=new ArrayList<>();
		boolean gone=true;
		
		while(gone) {
			System.out.println("Type your name to go to picnic");
			String name=sc.nextLine();
			picnic.add(name);
			System.out.println("Do you want to add someone");
			String ans=sc.nextLine();
			if(!ans.equalsIgnoreCase("yes")) {
				gone=false;
			}
			else {
				gone=true;
			}
		}
		System.out.println("The lists who is coming");
		System.out.println(picnic);
		
		System.out.println("You can remove, replace or check someone");
		String anns=sc.nextLine();
		
		if(anns.equalsIgnoreCase("remove")) {
			System.out.println("You can remove typing the name");
			String rm=sc.nextLine();
			picnic.remove(rm);
			System.out.println("List after removing" + picnic);
		}
		
		if(anns.equalsIgnoreCase("replace")) {
			System.out.println("You can replace by index number and name");
			int num=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			picnic.set(num, name);
		}
		
		if(anns.equalsIgnoreCase("check")) {
			System.out.println("If you want to check someone enter the name");
			String name=sc.nextLine();
			boolean check=picnic.contains(name);
			System.out.println(check);
		}
		
		Collections.sort(picnic);
		
		for(int i=0; i<picnic.size(); i++) {
			System.out.println(picnic.get(i));
		}
			
	}
}
