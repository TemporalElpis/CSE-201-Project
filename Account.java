
public class Account {
	private String name;
	private String password;
	public Account(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//check two accounts equals 
	public boolean equals(Account account) {
		if(this.getName().equals(account.getName())&&this.getPassword().equals(account.getPassword())) {
			return true;
		}
		return false;
	}
	
	//toString
	public String toString() {
		return name + ", " + password;
	}
}
