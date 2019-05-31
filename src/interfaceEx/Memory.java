package interfaceEx;

public interface Memory extends faceRecognition {
	
	int MEMORY=128; 
	int SIZE=8;             // public static final
	
	void location();
	public abstract void capacity();
	
	public static void staticMethod() {
		System.out.println("Interface static Method");
	}
	
	default void defaultMethod() {
		System.out.println("Interface default Method");
	}
	
	
}
