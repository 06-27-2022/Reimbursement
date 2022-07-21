package app.Reimbursement.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.Reimbursement.EmployeeRepository;
import app.Reimbursement.EmployeeRepositoryImpl;
import app.Reimbursement.Employees;

public class AllEmployeesServlet extends HttpServlet{

	private static final long serialVersionUID = -5830494828800950472L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("it works");
	
	//Step 1:
	EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
	List<Employees>employees = employeeRepository.findallAssociates();
	
	
	//Step 2:
	ObjectMapper imTheMap = new ObjectMapper();
	String json = imTheMap.writeValueAsString(employees);
	
	//Step 3:
	response.setContentType("application/json");// important to set content type
	PrintWriter writer = response.getWriter();
	writer.write(json);
	
	}

}
