package flyable;

public interface Flyable extends Sound{  
	
	
	int WINGCOUNT=2; // BY DEFAULT IT IS ->  public static final
	int TAILCOUNT=1;   // ALL FINAL KEYWORD SHOULD BE UPPER_CASE
	
	// void fly();  // public static fly(); -> actual  // BY DEFAULT
	abstract void fly(); // now it's DEFAULT abstract void fly();  ->by default
	
}
