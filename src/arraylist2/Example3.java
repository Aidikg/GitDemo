package arraylist2;

public class Example3 {
	public static void main(String[] args) {
		
		int[] a= {1, 2,3,4,5,4,3,2,1,0};
		int total=0;
		
		for(int i=0; i<10; i++) {
			total=a[i]-total;
			System.out.print(total+" ");
		}
		System.out.println();
		
		// Example 2
		System.out.println(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if(i<a.length-1) {
				System.out.print(" | ");
			}
		}
		
	}
}
