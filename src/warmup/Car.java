package warmup;

import java.util.Arrays;

public class Car {
	String make;
	String model;
	int year;
	double currentSpeed;
	boolean isRunning;
	
	public void start() {
		isRunning=true;  // this.isRunning
	}
	public void stop() {
		isRunning=false;
	}
	
	public void accelerate(int speed) {
		for(double i=currentSpeed; i<speed; i++) {
			System.out.print(i+" ");
		}
		currentSpeed=speed;
	}
	
	public void slowdown(int targetSpeed) {
		for(double i=currentSpeed; i>=targetSpeed; i--) {
			System.out.print(i+" ");
		}
		currentSpeed=targetSpeed;
	}
	
	public String getCarInfo() {
		return make+" "+model+" "+year;
	}
	
	public void getDirections(String direction1, String direction2, String direction3) {
		System.out.println("Turning "+direction1);
		System.out.println("Turning "+direction2);
		System.out.println("Turning "+direction3);
	}
	
	public long getTotalDistance(long[] distances) {
		long sum=0;
		for(long i: distances) {
			sum+=i;	
		}
		return sum;
	}
	
	
	public long getMaxDistance(long[] distances) {
		Arrays.sort(distances);  // sort
		return distances[distances.length-1];  // getMax
	}
	
	public long[] removeLongestDistance(long[] distances) {  // return new array
		Arrays.sort(distances);
		long[] newArr=new long[distances.length-2];
		
		for(int i=1, count=0; i<distances.length-1; i++, count++) {
			newArr[count]=distances[i];
		}
		return newArr;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
