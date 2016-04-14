package security.logic;

public class UserLoggedInLazy {
	private static UserLoggedInLazy userloggedin = null;
	private String userid = null;
	
	private UserLoggedInLazy() {
	}
	
	public static UserLoggedInLazy instance() {
		if (userloggedin == null) {
			userloggedin = new UserLoggedInLazy();
		}
		return userloggedin;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
