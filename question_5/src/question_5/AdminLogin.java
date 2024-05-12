package question_5;

public class AdminLogin {
	private String emailId;
	private String password;
	
	
	public AdminLogin(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
