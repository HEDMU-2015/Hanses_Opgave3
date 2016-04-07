package security.logic;

import security.domain.User;

public class UserLoggedInEager {
	private static User userloggedin = new User();
	
	private UserLoggedInEager() {
	}
	
	public static User instance() {
		return userloggedin;
	}

}
