package project1;

import java.util.Scanner;

public class PassFail {
	Scanner input=new Scanner(System.in);
	String name, object;
	char grade;
	int score1, score2, score3;
	
	public void output() {
		System.out.println("Name ");
		name=input.nextLine();
		System.out.println("Choose your object: Math, Biology, Computer Science");
		object=input.nextLine().toLowerCase();
		if(object.equals("math")) {
			math();
		}
		if(object.equals("biology")) {
			biology();
		}
		if(object.equals("computer science")) {
			computer();
		}
	
	}
	public int getAverage() {
		int average;
		average=(score1+score2+score3)/3;
		return average;
	}
	public void math() {
		int result=0;
		System.out.println("Your fist exam score");
		score1=input.nextInt();
		System.out.println("Your second exam score");
		score2=input.nextInt();
		System.out.println("Your third exam score");
		score3=input.nextInt();
		System.out.println(" Average: ");
		result=getAverage();
		System.out.println(result);
		
		if(result>70) {
			System.out.println("You pass exam");
		}
		else if(result>50 && result<=70) {
			System.out.println("Take exam again");
		}
		else {
			System.out.println("You failed your exam");
		}
		
	}
	
	public void biology() {
		int result=0;
		System.out.println("Your fist exam score");
		score1=input.nextInt();
		System.out.println("Your second exam score");
		score2=input.nextInt();
		System.out.println("Your third exam score");
		score3=input.nextInt();
		System.out.println(" Average: ");
		result=getAverage();
		System.out.println(result);
		
		if(result>80) {
			System.out.println("You pass exam");
		}
		else if(result>55 && result<=75) {
			System.out.println("Take exam again");
		}
		else {
			System.out.println("You failed your exam");
		}
		
	}
	
	public void computer() {
		int result=0;
		System.out.println("Your fist exam score");
		score1=input.nextInt();
		System.out.println("Your second exam score");
		score2=input.nextInt();
		System.out.println("Your lab score");
		score3=input.nextInt();
		System.out.println(" Average: ");
		result=getAverage();
		System.out.println(result);
		
		if(result>75) {
			System.out.println("You pass exam");
		}
		else if(result>50 && result<=75) {
			System.out.println("Take exam again");
		}
		else {
			System.out.println("You failed your exam");
		}
		
	}
	
}
