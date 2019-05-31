package arrays;

public class ArrayUtils {
	
	public String arrayHelper(String[] str) {
		String conver="25 years after the genocide in Rwanda, women once divided by "
				+ "war find common ground and friendship through their shared livelihood "
				+ "of coffee—rising above to choose forgiveness.";
		return conver ;
	}
	
	public static void main(String[] args) {
		String conver="25 years after the genocide in Rwanda, women once divided by "
				+ "war find common ground and friendship through their shared livelihood "
				+ "of coffee—rising above to choose forgiveness.";
		
		
		if(conver.split(" ").length>100) {
			new ArrayUtils().arrayHelper(conver.split(" "));
		}
		else {
			System.out.println("It is short conversation");
		}
	}
}
