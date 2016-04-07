package security.logic;

import security.domain.User;

public class UserLoggedInLazy {
	private static User userloggedin = null;
	
	private UserLoggedInLazy() {
	}
	
	public static User instance() {
		if (userloggedin == null) {
			userloggedin = new User();
		}
		return userloggedin;
	}

}
