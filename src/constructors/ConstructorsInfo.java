package constructors;

public class ConstructorsInfo {
	public static void main(String[] args) {
		// Constructors special method that doesnt have return type
		// Name of Const_name  the same name as a Class
		// Access modifier  -> default public protected
		// Class by default create Constructor
		
		// Example 1
		Person person=new Person("Aku", "Kur", 26);
		
		// Example 2
		Custom custom1=new Custom();
		Custom custom2=new Custom("Aidina");
		
		//System.out.println(custom2);
		//Custom custom3=new Custom( 26, "aku");  // Negative scenario
		Custom custom3=new Custom("Aidina", 26);  // Positive scenario
		Custom custom4=new Custom("Aidina", -26);  // Positive scenario
		
		// Example 3
		Jordan person1=new Jordan();
		Jordan person4=person1;
		Jordan person2=new Jordan(34);
		Jordan person3=new Jordan("Good", 11, "Music");
		Jordan person5=new Jordan("Gerald", "Green", "45");
		System.out.println(person5.toString());
	}
}
