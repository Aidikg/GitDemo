package modifiers;

public class HomeTest {
	public static void main(String[] args) {
		Home home1=new Home();
		home1.size=1000;
		home1.bedroom=3;
		home1.color="White";
		//home1.garden=true;  -> garden access is private
		home1.floor=2;
		
		home1.decreaseTemp(45);
		
	}
}
