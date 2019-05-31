package warmup;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.setName("Sarah ");
		e1.setLastName("Smith ");
		e1.setGender("F ");
		e1.setSSN(23456789);
		
		System.out.println(e1.getName()); 
		System.out.println(e1.getLastName());
		System.out.println(e1.getName()+e1.getLastName()+e1.getGender()+e1.getSSN());
		
		
	}
}
