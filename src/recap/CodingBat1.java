package recap;

public class CodingBat1 {
	public static void main(String[] args) {
		
		// Max in array
		int[] nums= {2,5,8};
		int max=nums[0];
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println(max);
	}
}
