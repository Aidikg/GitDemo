package recap;

public class StaticBlock {
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	
	public StaticBlock() {
		System.out.println("3");
	}
	static {
		System.out.println("4");
	}
	{
		System.out.println("5");
	}
}
