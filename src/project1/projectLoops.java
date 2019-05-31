package project1;

public class projectLoops {
	 
    //write a code that will accept Integer and will print all odd number from 0 to num
    public static int[] forLoop1(int num) {
        //code
    	int[] newArray=new int[5];
    	int a=0;
    	for(int i=0; i<=num; i++) {
    		if(i%2==1) {
    			newArray[a]=i;
    			a++;
    		}
    	}
        return newArray;
    }
    
    /*write a code that will accept Integer and will print all Integers that is divideble 
     * by 3 and 5 from 0 to num
     */ 
    public static int[] forLoop2(int num) {
        //code
    	for(int i=0; i<=num; i++) {
    		if(i%3==0 && i%5==0) {
    			System.out.println(i);
    		}
    	}
        return new int[5];
    }
    
    /* write a code that will print all prime numbers that are in range of 0 and num
     * 
     */
    public static int[] forLoop3(int num) {
        //code
    	for(int i=0; i<=num; i++) {
    		if(i%i==0 && i%1==0) {
    			System.out.println(i);
    		}
    	}
        return new int[5];
    }
    
    /* write a code that will check if entered letter 
     * is vowel or constant 
     */
    public static String forLoop4(char letter) {
        //code
    	String result="";
    	if(letter=='a' || letter=='e' || letter=='u'|| letter=='o' || letter=='y') {
    		result="vowel";
    	}
    	else {
    		result="constant";
    	}
        return new String(result);
    }
    
    /*Please write a code that will accept multiple coins 
     * and will return total amount in quarters, dimes, and nickels.
     * Example: entered coins {25,5,10,5,25,5}
     * Console result: You have 2 quarters, 1 dime, and 3 nickels.
     */
    public static String coins(int[] coins) {
        //code
        return new String();
    }
}
