package inheritance;

class Doctor {
	void docDetails() {
		System.out.println("Doctor details ");
	}
}

class Surgeon extends Doctor{
	void surDetails() {
		System.out.println("Surgen details");
	}
}

public class Hospital2{
	public static void main(String[] args) {
		
		Surgeon s=new Surgeon();
		s.docDetails();
		s.surDetails();
		
	}
}
