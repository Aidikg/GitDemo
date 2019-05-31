package warmup;

public class Employee {
	private String name;
	private String lastName;
	private String dob;
	private int SSN;
	private String gender;
	
	public void setName(String name) {
		this.name=name;

	}
	public String getName() {  // always without parameters
		return name;
	}
	
	public void setLastName(String lastName) { // getlastName -> more proffessional
		this.lastName=lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	
	public void setSSN(int SSN) {
		this.SSN=SSN;
	}
	public int getSSN() {
		return SSN;
	}
}
