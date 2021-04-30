package kodlamaioInheritance;

public class User {
	
	int id;
	String userName;
	String lastName;
	
	public User() {
		
	}
	
	public User(int id, String userName, String lastName) {
		super();
		this.id = id;
		this.userName = userName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
