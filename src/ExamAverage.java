import java.util.Scanner;

public class ExamAverage {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter word: ");
		String word=input.nextLine();
		
		System.out.println("Enter charackter");
		String c=input.nextLine();
		
		int count=0;
		do {
			count++;
		}while(c.length()>0);
		System.out.println(count);
		
//		double sum;
//		int numofStudents;
//		double next;
//		String answer;
//		
//		do {
//			System.out.println("Enter all the scores to be averaged");
//			System.out.println("Enter negative number after");
//			System.out.println("You have entered all the scores");
//			sum=0;
//			numofStudents=0;
//			next=input.nextDouble();
//			while(next>=0) {
//				sum=sum+next;
//				numofStudents++;
//				next=input.nextDouble();
//			}
//			if(numofStudents>0) {
//				System.out.println("The average is "+sum/numofStudents);
//			}
//			else {
//				System.out.println("No score to average");
//			}
//			System.out.println("Want to average another exam?");
//			System.out.println("Enter yes or no");
//			answer=input.next();
//		} while(answer.equalsIgnoreCase("yes"));
	}
}
