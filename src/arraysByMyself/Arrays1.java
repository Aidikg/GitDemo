package arraysByMyself;

public class Arrays1 {
	public static void main(String[] args) {
		double[] myList= {1.9, 2.5, 3.5};
		
		// Print all the array elements
		for(int i=0; i<myList.length; i++) {
			System.out.print(myList[i]+" ");
		}
		System.out.println();
		
		//Summing all elements
		double total=0;
		for(int i=0; i<myList.length; i++) {
			total+=myList[i];
		}
		System.out.println("Total is "+total);
		
		// Finding largest element
		double max=myList[0];
		for(int i=0; i<myList.length; i++) {
			if(myList[i]>max) {
				max=myList[i];
			}
		}
		System.out.println("Max is "+max);
		
		// For-Each Array
		System.out.print(" For - Each: ");
		int[] nums= {10,30,20,67,90};
		for(int i: nums) {
			System.out.print(i+" ");
		}
	}
}
