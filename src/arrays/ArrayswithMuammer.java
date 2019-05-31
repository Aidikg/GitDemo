package arrays;
import java.util.Arrays;

public class ArrayswithMuammer {
	public static void main(String[] args) {
		// multibranch arrays
		String[][] fruits=new String[2][3];
		fruits[0][0]="apple1";
		fruits[0][1]="apple2";
		fruits[0][2]="apple3";
		
		fruits[1][0]="orange1";
		fruits[1][1]="orange2";
		fruits[1][2]="orange3";
		
		for(int i=0; i<fruits.length; i++) {
			for(int j=0; j<fruits[i].length;j++) {
				System.out.print(fruits[i][j]+" ");
			}
			System.out.println();
		}
		
		
		// binarySearch
//		String[] soccerPlayer=new String[4];
//		soccerPlayer[0]="Aidina";
//		soccerPlayer[1]="Nurjigit";
//		soccerPlayer[2]="Tolgonai";
//		soccerPlayer[3]="Medet";
//		Arrays.sort(soccerPlayer);
//		System.out.println(Arrays.toString(soccerPlayer));
//		
//		// After binarySearch()
//		System.out.println(Arrays.binarySearch(soccerPlayer,"Messi"));
		

		// Soccer Game
//		String[] player=new String[4];
//		player[0]="Aidina";
//		player[1]="Maradonna";
//		player[2]="Pele";
//		player[3]="Kristiano";
//
//		Arrays.sort(player);
//		System.out.println(Arrays.toString(player));
		
		//Example 3
//		String[] playersPower=new String[4];
//		
//		playersPower[0]="100";
//		playersPower[1]="95";
//		playersPower[2]="88";
//		playersPower[3]="11";
//		Arrays.sort(playersPower);
//		System.out.println(Arrays.toString(playersPower));
		
		// Example 2
//		int[] num=new int[4];
//		num[0]=6;
//		num[1]=4;
//		num[2]=1;
//		num[3]=10;
//		System.out.println(num[0]);
//		
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		System.out.println(num[0]);
		
		// Example 1
//		String[] game=new String[4];
//		
//		game[0]="soccer";
//		game[1]="chess";
//		game[2]="basketball";
//		game[3]="tennis";
//		
//		System.out.println("This is Game: "+ Arrays.toString(game));
//		
//		String[] fun=game;
//		System.out.println("This is Fun: "+ Arrays.toString(fun));
//		
//		for(int i=0; i<game.length; i++) {
//			System.out.println(fun[i]);
//		}
	}
}
