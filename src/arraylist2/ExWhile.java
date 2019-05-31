package arraylist2;

public class ExWhile {
	public static void main(String[] args) {
		
		String card="4412-4578-9078-3759";
		int i=0;
		
		while(i<card.length()) { // while true
			char ch=card.charAt(i);
			
			if(ch==' ' || ch=='-' ) {
				String before=card.substring(0, i);
				String after=card.substring(i+1);
				card=before+after;
			}
			else {
				i++;
			}
		}
		System.out.println(card);
	}
}
