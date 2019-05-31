package arrayList;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public static void main(String[] args) {
		
		List<User> users=new ArrayList<>();
		users.add(new User("Aku", 26));
		users.add(new User("Toku", 27));
		users.add(new User("Asel", 32));
		//System.out.println(users.get(0));
		
		users.forEach(user -> {
            System.out.println("Name : " + user.getName() + ", Age : " + user.getAge());
        });
		
	}
}
