package constructor;

public class ConsMet {
	String name;  // polucahetsy name=Aku
	
	public void met() {
		this.name="Toku";
	}
	public void met2(String name) {
		this.name="Toku";
		System.out.println(name);
	}
	
	ConsMet(){
		this.name="Aku";
	}
	ConsMet(String name){
		this.name="Toku";
		System.out.println(name);
	}
//	public void met() {
//		this.name="Toku";
//	}
	
	public static void main(String[] args) {
		ConsMet obj=new ConsMet();
		System.out.println(obj.name); //Aku from ConsMet()  initializing
		
		ConsMet obj1=new ConsMet("Asel"); // Asel from ConsMet(String name)   initializing just one time
		
//		ConsMet obj2=new ConsMet();
//		System.out.println(obj2.name);  // Aku from ConsMet()
		
		ConsMet mett=new ConsMet();
		mett.met2("Guku");
	}
}
