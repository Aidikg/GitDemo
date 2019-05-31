package arrays2;

public class SwapMaxMin {
	public static void main(String[] args) {
		
		int[] score=new int[6];
		
		// Randomly create Score
		for(int i=0; i<score.length; i++) {
			score[i]=(int)(Math.random()*100)+1;
		}
		
		// Print out randomly created Score
		for(int i=0; i<score.length; i++) {
			System.out.println(" My Score [ "+ i+" ] "+score[i]);
		}
		
		int maxx=score[0];
		int maxIndex=0;
		
		// find max Score
		for(int i=0; i<score.length; i++) {
			if(score[i]>maxx) {
				maxx=score[i];
				maxIndex=i;
			}
		}
		System.out.println("Max Score is "+maxx);
		System.out.println("Max Score in Index: "+maxIndex);
		
		// find min Score
		int minn=score[0];
		int minIndex=0;
		
		for(int j=0; j<score.length; j++) {
			if(score[j]<minn) {
				minn=score[j];
				minIndex=j;
			}
		}
		
		System.out.println("Min Score is "+ minn);
		System.out.println("Min Srore in Index "+minIndex);
		
		for(int k=0; k<score.length; k++) {
			System.out.println(score[k]);
		}
	}
}
