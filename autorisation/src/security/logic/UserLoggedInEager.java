package security.logic;

public class UserLoggedInEager {
	private static UserLoggedInEager userloggedin = new UserLoggedInEager();
	private String userid = null;
	
	private UserLoggedInEager() {
	}
	
	public static UserLoggedInEager instance() {
		return userloggedin;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

}
