package methods;

public class TestPlayers {
	public static void main(String[] args) {
		
		Players player1=new Players();
		
		player1.name="Messi"; 
		player1.age=33; 
		player1.power=97; 
		
		Players player2=new Players();
		player2.name="Maradonna";
		player2.age=55; 
		player2.power=100;
		
		Players player3=new Players();
		player3.name="Pele"; 
		player3.age=40;
		player3.power=91;
	
	System.out.println(player1.name);
	}
}
