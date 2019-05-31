package arrays;

public class TheNewBoston {
	
	public static int[] copy(int[] a) {
		int[] b=new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i]=a[i];
			
		}
		return b;
	}
	

	// Example 1
//	public static void change(int[] num) {
//		for(int i=0; i<num.length; i++) {
//			num[i]+=num[i];
//		}
//	}
	
	public static void main(String[] args) {
		
		int[] a= {2,3,4,5};
		copy(a);
		for(int i:a) {
			System.out.println(i);
		}
		
		
		// Example 1
//		int[] nums= {3,4,5,6,7};
//		change(nums);
//		for(int i: nums) {
//			System.out.println(i);
//		}
		
	}
	
}
