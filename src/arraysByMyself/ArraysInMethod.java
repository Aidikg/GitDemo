package arraysByMyself;

public class ArraysInMethod {

	// Example 2
	public int[] reverse(int[] list) {
		int[] result=new int[list.length];
		
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		
		return result;  //return 
	}
	
	
	// Example 1
	public void printArr(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
