package client.dominio;

public class User {
	
	private String username;
	private String password;
	private Boolean succes;
	
	
	public User() {
		
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
				
	}
	
	public Boolean getSucces() {
		return succes;
	}
	public void setSucces(Boolean succes) {
		this.succes = succes;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
