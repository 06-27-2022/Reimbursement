package app.Reimbursement;

import java.util.Objects;

public class Employees {
/**
 * Fields for class Employees
 * 
 */
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private UserRole role;
	
	public Employees() {
		super();
	}
	
	public Employees (int id, 
			String firstName, 
			String lastName, 
			String username, 
			String password, 
			UserRole role) {
//		super();
		/**
		 * Object Employees parameters
		 */
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	/**
	 * Get/Set methods
	 * @return
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role= role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName, password, role, username);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employees other = (Employees) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName)
				&& Objects.equals(password, other.password) && role == other.role
				&& Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username
				+ ", password=" + password + ", role=" + role + "]";
	}

	public static void add(Employees employee) {
		// TODO Auto-generated method stub
		
	}
	

	
	

}