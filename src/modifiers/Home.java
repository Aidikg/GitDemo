package modifiers;

public class Home {
	int size, floor, bedroom, livingroom;
	int restroom, window, door, temperature;
	int gardenLength, gardenWidth;
	String name, color;
	private boolean garden;
	int gardenArea;
	
	// method to increase the temperature of the home
	public int increaseTemp(int temp) {
		temp+=temp;
		return temp;
	}
	
	public int decreaseTemp(int temp) {
		temp-=temp;
		return temp;
	}
	
	public int gardenMethod(boolean checkGarden, int len, int wid) {
		if(checkGarden==true) {
			gardenArea=len*wid;
		}
		return gardenArea;
	}
	
}
