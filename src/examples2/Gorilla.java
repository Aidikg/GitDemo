package examples2;

public class Gorilla {
	public static int count;
	public static void addGorilla() {
		count++;
	}
	public void babyGor() {
		count++;
	}
	public void ann() {
		addGorilla();
		babyGor();
	}
	
	public static void announce() {
		addGorilla();
		//babyGor();   DOES NOT compile
	}
	public int total;
	//public static ave=total/count;   // DOES NOT Compile
}
