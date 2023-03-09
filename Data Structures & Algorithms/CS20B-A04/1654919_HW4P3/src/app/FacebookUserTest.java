package app;

import adt.FacebookUser;

public class FacebookUserTest {

	public static void main(String[] args){
		
		FacebookUser user1 = new FacebookUser("PersonA", 19);
		FacebookUser user2 = new FacebookUser("PersonB", 500);
		FacebookUser user3 = new FacebookUser("PersonC", 15000);
		
		System.out.println("Using 3 users to display results");
		System.out.println(user1.toString()+"\n"+user2.toString() +"\n"+ user3.toString());
		
		
		System.out.println("Should be -1:  " + 		user1.compareTo(user2));
		System.out.println("Should be -1:  " + 		user2.compareTo(user3));
		System.out.println("Should be -1:  " + 		user1.compareTo(user3));

		System.out.println("Should be 1:  " + 		user3.compareTo(user2));
		System.out.println("Should be 1:  " + 		user2.compareTo(user1));
		System.out.println("Should be 1:  " + 		user3.compareTo(user1));

		System.out.println("Add another user with 500 friends");
		FacebookUser user4 = new FacebookUser("PersonD", 500);
		System.out.println("Should be 0:  " + 		user2.compareTo(user4));
		System.out.println("Should be 0:  " + 		user4.compareTo(user2));

		System.out.println("Finally to test the order of the names using Collections list sorting based on <String> type");
		System.out.println("Should be 1: " + user3.compareTo2(user1));
		System.out.println("Should be -1: " + user1.compareTo2(user2));
		System.out.println("Should be 1: " + user2.compareTo2(user1));
		System.out.println("Should be -1: " + user3.compareTo2(user4));
		
		
	}

}
