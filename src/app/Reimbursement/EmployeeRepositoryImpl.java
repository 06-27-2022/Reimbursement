package app.Reimbursement;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import app.Reimbursement.Employees;
import connectionUtil.ConnectionUtil;

public class EmployeeRepositoryImpl implements EmployeeRepository{

	public List<Employees> findAllEmployees(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet set = null;
		
		List<Employees> Employee = new ArrayList<>();
		
		final String SQL = "select * from employees";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt =(Statement) conn.createStatement();
			set = ((java.sql.Statement) stmt).executeQuery(SQL);
			
			while(set.next()) {
				
				Employees employee = new Employees(
						set.getInt(1),
						set.getString(2),
						set.getString(3),
						set.getString(4),
						set.getString(5),
						set.getUserRole(6), null);
				
				Employees.add(employee);
			}
			
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					conn.close();
					stmt.close();
					set.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		return Employee;
	}

	@Override
	public List<Employees> findallAssociates() {
		// TODO Auto-generated method stub
		return null;
	}

	//For saving new User Account
	
	@Override
	public void save(Employees Employee) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		PreparedStatement stmt = null;
		
		final String SQL = "insert into Employees values (default, ?, ?, ?, ?, ?";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			
			stmt.setString(1, Employee.getFirstName());
			stmt.setString(2, Employee.getLastName());
			stmt.setString(3, Employee.getUsername());
			stmt.setString(4, Employee.getPassword());
			stmt.setUserRole(5, Employee.getRole());
			stmt.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
			}
		finally {
			try {
				conn.close();
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	//For updating existing Employee user name and password
	@Override
	public void update(Employees Employee) {
		// TODO Auto-generated method stub
		Connection conn = null;
		
		PreparedStatement stmt = null;
		final String SQL= "update Employees set employee_username = ?, employee_password where id = ?";
		
		try {
			conn = ConnectionUtil.getNewConnection();
			stmt = conn.prepareStatement(SQL);
			
			stmt.setString(3, Employee.getUsername());
			stmt.setString(4, Employee.getPassword());
			stmt.setInt(0, Employee.getId());
			stmt.execute();	
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
				
			}
		}
	}

	@Override
	public void add(Employees Employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employees findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
