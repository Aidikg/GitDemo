package methods;

public class Pharmacy {
	String name;
	String lname;
	int doy;
	int age;
	char gender;
	String drug;
	int drugnum;
	int drugprice;
	boolean insurance;
	boolean almondAllergy;
	
	//method Allergy
	public void checkAllergy(boolean almondAllergy) {
		if(almondAllergy==true) {
			System.out.println("You cannot use "+drug);
		}
		else {
			System.out.println("You can use "+drug);
		}
	}
	
	//method Insurance
	public void checkInsurance(boolean insurance, int drugprice1) {
		if(insurance==true) {
			System.out.println("Drug price is: "+drugprice1/2);
		}
		else {
			System.out.println("Drug price is: "+ drugprice);
		}
	}
}
