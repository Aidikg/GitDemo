package strBuilder;

public class Builder {
	public static void main(String[] args) {
		String alp="";
		
		// String creating 27 different location
		for(char ch='a'; ch<='z'; ch++) {
			alp+=ch;
			System.out.println(alp);
		}
		System.out.println(alp);
		
		// StringBuilder takes just one location
		StringBuilder builder=new StringBuilder();
		StringBuilder s1=new StringBuilder("Tech ");
		StringBuilder s2=new StringBuilder(10);
		
		builder.append(10+" ");
		builder.append("String Builder"+" ");
		builder.append(true);
		System.out.println(builder);
		
		s1.append("techtorial ").append(2019).append(" course ");
		System.out.println(s1);
		System.out.println("--------------------------------------------------------------------------");
		// stringBuilder alphabet
		StringBuilder alp2=new StringBuilder(10);
		for(char ch='a'; ch<='z'; ch++) {
			alp2.append(ch);
			//System.out.println(alp);
		}
		System.out.println(alp);
		
	}
}
