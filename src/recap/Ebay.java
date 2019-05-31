package recap;

public class Ebay {
	
	public static void navigate(String url) {
		System.out.println("Navigate to "+url);
	}
	
	public static void login(String userName, String passwd) {
		System.out.println("Logging in to Ebay with username "+userName+" "+passwd);
		
	}
	
	public static void search(String item) {
		System.out.println("Searching for "+item);
	}
}
