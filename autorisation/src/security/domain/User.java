package security.domain;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class User {
	
	private String id;
	private String encryptedPassword;
	private String email;
	
	public static String encrypt(String txt) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] mdbytes = md.digest(txt.getBytes());
		return Base64.getEncoder().encodeToString(mdbytes);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	
	public void setAndEncryptPassword(String password) throws NoSuchAlgorithmException {
		this.encryptedPassword = encrypt(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", encryptedPassword=" + encryptedPassword + ", email=" + email + "]";
	}


}
