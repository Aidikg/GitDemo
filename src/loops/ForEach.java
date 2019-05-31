package loops;

public class ForEach {
	enum Suit {clubs, diamond, hearts,spades};
	public static void main(String[] args) {
		for(Suit nextSuit: Suit.values()) {
			System.out.print(nextSuit+ " ");
		}
		System.out.println();
	}
}
