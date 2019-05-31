import java.util.ArrayList;
import java.util.List;

public class Spectacular {
	public static void main(String[] args) {
		int num=23;
		int result=dividetoNum(num);
		
		while(result!=1 && result!=4) {
			result=dividetoNum(result);
		}
		
		if(result==1) {
			System.out.println(num+" is spectacular number ");
		} else {
			System.out.println(num+ " is not spectacular ");
		}
	}
	
	public static int dividetoNum(int num) {
		List<Integer> digits=new ArrayList<>();
		int sum=0, i=0;
		
		while(num>0) {
			digits.add(num%10);
			sum=sum+digits.get(i)*digits.get(i);
			i++;
			num=num/10;
			System.out.println(sum);
		}
		return sum;
	}
}
