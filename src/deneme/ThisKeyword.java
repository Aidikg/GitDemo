package deneme;

public class ThisKeyword {
	int a; 
	int b;
	
//	public void setData(int c, int d) {
//		a=c;
//		b=d;
//	}
	public void setData(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void showData() {
		System.out.println("Value of A= "+a);
		System.out.println("Value of B= "+b);
	}
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword();
		obj.setData(2, 3);
		obj.showData();
	}
}
