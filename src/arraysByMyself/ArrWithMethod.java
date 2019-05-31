package arraysByMyself;

public class ArrWithMethod {
	
	// Sum of Values
	public static int sum4(int[]nums) {
		int sumVal=0;
		for(int i=0; i<nums.length; i++) {
			sumVal+=nums[i];
		}
		return sumVal;
	}
	
	// Example with sum
	public static int sum3(int[]nums) {
		int sumindex=0;
		for(int i=0; i<nums.length; i++) {
			sumindex+=i;
		}
		return sumindex;
	}
	
	
	// Example with Char
	public char[] toCharArray(String token) {
		char[] elts=new char[token.length()];
		String sp="";
		
		for(int i=0; i<token.length(); i++) {
			sp+=" ";
			elts[i]=token.charAt(i);
		}
		return elts;
	}
	
	
	// Example 1
	public double sumArr(double[] vals) {
		double sum=0;
		
		for(int i=0; i<vals.length; i++) {
			sum+=vals[i];
		}
		return sum;
	}
	
	
	
}
