package app.Reimbursement;

public class UserRole {
	//implements?
	
	private int id;
	private String role;
	
	public UserRole() {}
	
	/**
	 * Constructor with 2 parameters
	 * @param id the id for the role: 
	 * @param role the name of the role: regular employee or manager
	 */
	
	public UserRole(int id, String role) {
		this.id = id;
		this.role = role;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRole [id=" + id + ", role=" + role + "]";
	}

	
	
	

}
