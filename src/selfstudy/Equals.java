package selfstudy;

public class Equals {
	public static void main(String[] args) {
		
		// == vs equals()
		String str=new String("hello");
		String word=new String("hi");
		
		System.out.println(str==word);
		System.out.println(str.equals(word));
		
		word=str;
		System.out.println(str==word);
		System.out.println(word);
		System.out.println(str.equals(word));
		
		
		// == vs eqauls()
//		boolean result;
//		String per=new String("coffee");
//		String cof=new String("coffee");
//		
//		result=(per==cof);
//		System.out.println(result);
//		
//		result=per.equals(cof);
//		System.out.println(result);
//		
//		per=cof;
//		result=per==cof;
//		System.out.println(result);
		
		
		// == vs equals()  
//		int a=6;
//		int b=6;
//		System.out.println(a==b);
//		
//		String obj=new String("moon");
//		String obj1=new String("moon");
//		System.out.println(obj==obj1);
//		System.out.println(obj.equals(obj1));
		
		
		//Object Comparison
//		String tab=new String("blue");
//		String tab1=new String("blue");
//		System.out.println(tab==tab1);
//		System.out.println(tab.equals(tab1));
		
		//String comparison
//		String table="dark";
//		String table1="dark";
//		
//		System.out.println(table==table1);
//		System.out.println(table.equals(table1));
	}
}
