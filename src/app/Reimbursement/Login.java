package app.Reimbursement;

import java.util.Scanner;

	public class Login {
		
		String username;
		String password;
		
		Login(String username, String password){
			this.username = username; //first "name" refers to class variable, second "name" refers to local
			this.password = password;
		}


	public static void main(String[] args) {
			

			Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter Username: ");
			String username = scan.nextLine();
			
			//a trick to clear out stream
//			scan.nextLine();
			
			System.out.print("Enter Password: ");
			String password = scan.nextLine();
			
//			String password = scan.nextLine();
			//converting String to an Integer
//			int numericAge = Integer.parseInt(age);
//			numericAge++;
			
			if (username.equals("Tabitha") && (password.equals("D4lie!"))) {
				System.out.print("Welcome, "+ username +"! You are now signed in!");
			
			}else {
				System.out.println("Error: Incorret username/password");
			}
			/*
			 * It is typical to close a resource. CANNOT open the Scanner again when you're done.
			 * scan.close();
			 */
			scan.close();
			
			
	}
	
	
	}


