package practice;

import java.util.HashMap;

public class User {
	 
    private long id;
    private String name;
    private String email;
    
    
    //Create a constructor for User
    public User(long id, String name, String email) {
    	this.id = id;
    	this.name = name;
    	this.email = email;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    
    
    //0. First run this code without changing anything. Is the behaviour at the client's side (main function) as you would
    //expect?
    
    //1. Automatically generate hashCode() and equals() in your IDE
    //For Eclipse: Right click -> Source -> Generate hashCode() and equals(). Use all three fields above. Examine and compare.
	
    

	public static void main(String[] args) {
    	HashMap<User, String> map = new HashMap<User, String>();
    	User u1 = new User(1234, "A", "B");
    	User u2 = new User(1235, "A", "B");
    	User u3 = new User(1234, "A", "B");
    	map.put(u1, "Y");
    	map.put(u2, "N");
    	map.put(u3, "Y");
    	
    	System.out.println(u1.equals(u2)); //explain why
    	System.out.println(u1.hashCode());
    	System.out.println(u2.hashCode());
    	System.out.println(u1.equals(u3));
    	
    	//A bizarre case of mutability
    	System.out.println("User 3 hashcode: " + u3.hashCode());
    	System.out.println("User 3 in the map? " + map.containsKey(u3));
    	u3.setName("C");
    	System.out.println("User 3 in the map? " + map.containsKey(u3));
    	System.out.println("User 3 hashcode: " + u3.hashCode());
    }    
}