package model;

public class Account {
	private int id; 
    private int username; 
    private String password; 
    private int choose;
    
    
	public Account() {
		super();
	}
    
	
    
	public Account(int username, String password, int choose) {
		super();
		this.username = username;
		this.password = password;
		this.choose = choose;
	}



	public Account(int id, int username, String password, int choose) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.choose = choose;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUsername() {
		return username;
	}


	public void setUsername(int username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getChoose() {
		return choose;
	}


	public void setChoose(int choose) {
		this.choose = choose;
	}
    
	
    
	
    
    
}
