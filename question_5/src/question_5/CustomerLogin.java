package question_5;

public class CustomerLogin {
	private String emailId;
	private String password;
	
	public CustomerLogin(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "CustomerLogin [emailId=" + emailId + ", password=" + password + "]";
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
