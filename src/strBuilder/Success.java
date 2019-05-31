package strBuilder;

public class Success {
	//Create the one StringBuilder give the name as a success and append the following values
    //Purpose - Self Confidence - enthusiasm - Expertise - Prepration,
    //self Discipline - Extraordinary performance
	public static void main(String[] args) {	
		//Example 1
		StringBuilder per=new StringBuilder("Extraordinary");
		StringBuilder success=per.append(" working");
		
		success=success.append(" hard on java ").append(" in 2019");
		System.out.println(success);
		System.out.println(per);
		StringBuilder tech=new StringBuilder("Techtorial ");
	
		tech=success.append(tech);
		
		System.out.println(tech);
		System.out.println(success);
		System.out.println(per);
		
		// Example 2
//		StringBuilder s=new StringBuilder();
//		s.append("Purpose ").append("Self Confidence ").append(" Entusiasm ").append("Self Discipline");
//		System.out.println(s);
//		s.append(true).append(10);
//		System.out.println(s);
//		System.out.println(s);
//		
//		StringBuilder ss=new StringBuilder("Hello ");
//		ss.append("World ");
//		StringBuilder archieve=ss.append(" Panda");
//		
//		System.out.println(ss);
//		System.out.println(archieve);
		
		
	}
}
