package flyable;

public class Test extends Object {
	public static void main(String[] args) {
		
		Bird b=new Bird();
		b.fly();
		b.sounds();
		System.out.println(b.WINGCOUNT);
		System.out.println(b.TAILCOUNT);
		System.out.println(b.toString());

	}	
	
	@Override
	public String toString() {
		return "bird class";
	}
}
