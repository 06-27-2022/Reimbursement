package app.Reimbursement;

import java.sql.Timestamp;

public class Tickets {
		
		private int id;
		private double ticketAmount;
		private Timestamp ticketSubmitted;
		private Timestamp ticketManaged;
		private String ticketDescription;
		private Employees ticketEmployee;
		private Employees ticketManager;
		private TicketStatus ticketStatus;
		private TicketType ticketType;
		
		
		public Tickets(int id, 
				double ticketAmount, 
				Timestamp ticketSubmitted,
				Timestamp ticketManaged,
				String ticketDescription,
				Employees ticketEmployee,
				Employees ticketManager,
				TicketStatus ticketStatus,
				TicketType ticketType) {
			this.id = id;
			this.ticketAmount = ticketAmount;
			this.ticketSubmitted = ticketSubmitted;
			this.ticketManaged = ticketManaged;
			this.ticketDescription = ticketDescription;
			this.ticketEmployee = ticketEmployee;
			this.ticketManager = ticketManager;
			this.ticketStatus = ticketStatus;
			this.ticketType = ticketType;
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
		 * @return the ticketAmount
		 */
		public double getTicketAmount() {
			return ticketAmount;
		}


		/**
		 * @param ticketAmount the ticketAmount to set
		 */
		public void setTicketAmount(double ticketAmount) {
			this.ticketAmount = ticketAmount;
		}


		/**
		 * @return the ticketSubmitted
		 */
		public Timestamp getTicketSubmitted() {
			return ticketSubmitted;
		}


		/**
		 * @param ticketSubmitted the ticketSubmitted to set
		 */
		public void setTicketSubmitted(Timestamp ticketSubmitted) {
			this.ticketSubmitted = ticketSubmitted;
		}


		/**
		 * @return the ticketManaged
		 */
		public Timestamp getTicketManaged() {
			return ticketManaged;
		}


		/**
		 * @param ticketManaged the ticketManaged to set
		 */
		public void setTicketManaged(Timestamp ticketManaged) {
			this.ticketManaged = ticketManaged;
		}


		/**
		 * @return the ticketDescription
		 */
		public String getTicketDescription() {
			return ticketDescription;
		}


		/**
		 * @param ticketDescription the ticketDescription to set
		 */
		public void setTicketDescription(String ticketDescription) {
			this.ticketDescription = ticketDescription;
		}


		/**
		 * @return the ticketEmployee
		 */
		public Employees getTicketEmployee() {
			return ticketEmployee;
		}


		/**
		 * @param ticketEmployee the ticketEmployee to set
		 */
		public void setTicketEmployee(Employees ticketEmployee) {
			this.ticketEmployee = ticketEmployee;
		}


		/**
		 * @return the ticketManager
		 */
		public Employees getTicketManager() {
			return ticketManager;
		}


		/**
		 * @param ticketManager the ticketManager to set
		 */
		public void setTicketManager(Employees ticketManager) {
			this.ticketManager = ticketManager;
		}


		/**
		 * @return the ticketStatus
		 */
		public TicketStatus getTicketStatus() {
			return ticketStatus;
		}


		/**
		 * @param ticketStatus the ticketStatus to set
		 */
		public void setTicketStatus(TicketStatus ticketStatus) {
			this.ticketStatus = ticketStatus;
		}


		/**
		 * @return the ticketType
		 */
		public TicketType getTicketType() {
			return ticketType;
		}


		/**
		 * @param ticketType the ticketType to set
		 */
		public void setTicketType(TicketType ticketType) {
			this.ticketType = ticketType;
		}


		@Override
		public String toString() {
			return "Tickets [id=" + id + ", ticketAmount=" + ticketAmount + ", ticketSubmitted=" + ticketSubmitted
					+ ", ticketManaged=" + ticketManaged + ", ticketDescription=" + ticketDescription
					+ ", ticketEmployee=" + ticketEmployee + ", ticketManager=" + ticketManager + ", ticketType="
					+ ticketType + "]";
		}
		
		
		
	
		
		 
	}
	

