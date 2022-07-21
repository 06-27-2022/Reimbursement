package app.Reimbursement.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.Reimbursement.Employees;

public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = -285461777936515898L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		response.setStatus(200);
		
		response.addHeader("Custom Header", "custom value");
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.write("<h1>Welcome to my app!</h1><p>This looks gross. </p>");

}
//Allow servlet to accept POST requests.	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//Intention behind sending a POST request as the client is to send data to the server
	
//		request.getInputStream();
		
		//Added Jackson dependency
		String requestBodyText = new String(request.getInputStream().readAllBytes());
		
		ObjectMapper objectMapper = new ObjectMapper();
		Employees employeeFromRequestBody = objectMapper.readValue(requestBodyText, Employees.class);
		System.out.println(employeeFromRequestBody);
		
		System.out.println(request.getInputStream());
		
	}
}
