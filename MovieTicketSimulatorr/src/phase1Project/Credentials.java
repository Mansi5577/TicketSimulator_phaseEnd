package phase1Project;

public class Credentials {
	private String username;
	private String password;

	public Credentials(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean validating(Object obj) {
		if (obj instanceof Credentials) {
			Credentials obj1 = (Credentials) obj;
			return this.username.equals(obj1.getUsername()) && this.password.equals(obj1.getPassword());
		}
		return false;

	}
}
