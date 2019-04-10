package co.com.google.certificacion.logingmailscreenplay.models;

public class Credenciales {
	private String user;
	private String password;
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Credenciales(String user, String password) {
	
		this.user = user;
		this.password = password;
	}

}
