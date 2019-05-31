package constructor;

public class Box {
	int width;
	int heigth;
	int depth;
	
	Box(){
		width=10;
		heigth=12;
		depth=15;
	}
	Box(Box ob){
		width=ob.width;
		heigth=ob.heigth;
		depth=ob.depth;
	}
	Box(int a, int b, int c){
		this.width=a;
		this.heigth=b;
		this.depth=c;
		System.out.println(a+b+c);
	}
	int getVolume() {
		return width+heigth+depth;
	}
	
	public static void main(String[] args) {
		Box obj=new Box();
		System.out.println(obj.getVolume());
		
		Box obj2=new Box(20, 30, 15);
		//System.out.println(obj2.getVolume());
		
		Box cloneBox=new Box(obj);
		System.out.println(cloneBox.getVolume());
	}
}
