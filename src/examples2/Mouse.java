package examples2;

public class Mouse {
	
	private int numT;
	private int numW;
	private int weight;
	
	public Mouse(int weight) {
		this(weight, 16);
	}
	
	public Mouse(int weight, int numT) {
		this(weight, numT, 6);
	}
	public Mouse(int weight, int numT, int numW) {
		this.numT=numT;
		this.numW=numW;
		this.weight=weight;
	}
	public void print() {
		System.out.println(weight+" "+numT+" "+numW);
	}
	public static void main(String[] args) {
		Mouse m=new Mouse(15);
		m.print();
	}
}
