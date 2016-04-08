package security.logic;

import security.domain.User;

public class UserLoggedInEager {
	private static UserLoggedInEager userloggedin = new UserLoggedInEager();
	private User user = null;
	
	private UserLoggedInEager() {
	}
	
	public static UserLoggedInEager instance() {
		return userloggedin;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
