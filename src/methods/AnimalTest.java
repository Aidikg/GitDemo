package methods;

import java.util.Scanner;

public class AnimalTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Animals cat=new Animals();
		
		cat.age=3;
		cat.color="white";
		cat.eyes=2;
		cat.gender='F';
		cat.name="Tom";
		cat.heart=true;
		System.out.println(cat.color);
		
		Animals dog=new Animals();
		dog.color="brown";
		dog.gender='M';
		System.out.println(dog.color);
		
		Animals cat1=cat;
		System.out.println(cat1.color);
	}
}
