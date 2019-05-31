package methods;

public class TestPharmacy {
	public static void main(String[] args) {
		Pharmacy patient=new Pharmacy();
		patient.name="Carlos";
		patient.lname="Iglesias";
		patient.age=27;
		patient.gender='M';
		patient.drug="Aspirin";
		patient.drugnum=121;
		patient.drugprice=20;
		patient.insurance=true;
		patient.doy=1992;
		patient.almondAllergy=true;
		
		patient.checkInsurance(patient.insurance, patient.drugprice);
		patient.checkAllergy(patient.almondAllergy);
	}
}
