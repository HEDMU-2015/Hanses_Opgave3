package security.logic;

import security.domain.User;

public class UserLoggedInLazy {
	private static UserLoggedInLazy userloggedin = null;
	private User user = null;
	
	private UserLoggedInLazy() {
	}
	
	public static UserLoggedInLazy instance() {
		if (userloggedin == null) {
			userloggedin = new UserLoggedInLazy();
		}
		return userloggedin;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
