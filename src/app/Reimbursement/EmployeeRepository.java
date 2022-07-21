package app.Reimbursement;

import java.util.List;

import app.Reimbursement.Employees;

public interface EmployeeRepository {
	

	List<Employees>findallAssociates();
	
	void save (Employees Employee);
	
	void update(Employees Employee);
	
	void add(Employees Employee);
	
	Employees findById (int id);
	
}
