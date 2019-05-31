package oop;

public class SDET extends ScrumTeam {
	
	String position="Java SDET";
	
	@Override
	public void work() {
		System.out.println(position+ " is building automation script");
	}
	
	static {
		System.out.println("Static class of SDET class");
	}
	{
		System.out.println("Instance block of SDET class");
	}
	public SDET() {
		System.out.println("Constructor of SDET class");
	}
}
