package oop;

public class ScrumTeam {
	private String ID;
	private String position="Team scrum Member";
	private int salary;
	
	public static String company="Google";
	public static final String CITY;
	
    static{
		CITY="Silicon Valley";
		System.out.println("Scrum team static block ");
		System.out.println(company);
	}
    
    {
    	System.out.println("Scrum Team Instance Block");
    }
    
    public ScrumTeam() {
    	System.out.println("Scrum Team Constructor");
    }

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void work() {
		System.out.println("Scrum team in the 5th sprint");
	}
	public Number calcSalary(int hours) {
		return hours*salary;
	}
}
