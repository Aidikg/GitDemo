package oop;

public class Test {
	public static void main(String[] args) {
		SDET s=new SDET();
		
//		System.out.println("----------------------------------------------");
//		SDET sdet2=new SDET();
//		System.out.println("----------------------------------------------");
//		SDET sdet3=new SDET();
		
		System.out.println("-----------------------------------------------");
		Developer dev=new Developer();
		dev.setSalary(60);
		System.out.println(dev.calcSalary(5));
	}
}
