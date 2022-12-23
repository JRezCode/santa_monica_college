package adt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FacebookUser implements Comparable<FacebookUser>{

	protected int numFriends;
	protected String username;
	
	public FacebookUser(String user, int friends) {
		username=user;
		numFriends=friends;
	}

	@Override
	public int compareTo(FacebookUser user) {
		if(this.numFriends<user.numFriends)
			return -1;
		else if(this.numFriends==user.numFriends)
			return 0;
		else
			return 1;
	}
	
	public int compareTo2(FacebookUser user){
		List<String> users = new ArrayList<>();
		users.add(this.username);
		users.add(user.username);
		Collections.sort(users);
		if(users.indexOf(this.username)<users.indexOf(user.username)){
			users.clear();
			return -1;}
		else
		{
			users.clear();
			return 1;}
	}
	
	@Override
	public String toString(){
		return "User: "+username+" with "+numFriends+" friends.";
	}
		
}
