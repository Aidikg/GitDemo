package interfaceEx;

import java.util.List;

public abstract class Phone implements faceRecognition, Memory {
	
	abstract void hi();
	
	List contactList;
	public String name;
	public String model;
	public int memory;
	
	public abstract void lock();
	public abstract void call(int number);
	public abstract void text();
	public abstract void takePicture();
}
