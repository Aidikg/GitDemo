package oop;

public class Developer extends ScrumTeam {
	
	String position="java Developer";
	
	public void work() {
		System.out.println(position+" is developing Application");
	}
	
	public Integer calcSalary(int hours) {
		return hours * getSalary();
	}
	
}
