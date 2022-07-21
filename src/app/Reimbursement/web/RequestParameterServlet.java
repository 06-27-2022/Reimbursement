package app.Reimbursement.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestParameterServlet extends HttpServlet{

	private static final long serialVersionUID = -2205586305631881328L;

	/**
	 * This servlet will handle/accept GET requests. Override doGet
	 * 
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getRequestURI()); //client request
		System.out.println(request.getQueryString()); //query string
		
	}
}
