package app.Reimbursement;

public class TicketType {
	
	private int id;
	private String type;
	
	public TicketType () {}
	
	public TicketType (int id, String type) {
	}{
		this.id = id;
		this.type = type;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TicketType [id=" + id + ", type=" + type + ", getId()=" + getId() + ", getType()=" + getType()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}