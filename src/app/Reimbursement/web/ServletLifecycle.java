package app.Reimbursement.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Not mapped: will not expose resource to client
 * @author tt
 * 
 * Server (Tomcat) is responsible for providing the proper runtime environment for the web application.
 * Observe the "Servlet Lifecycle" descibes from first instance to destruction
 * 1) init (initialization); methjod called when an instance of the servlet class is created
 * 		The servelt/web container is responsible for creating instances of servlet based on the url pattern.
 * 		Only called once
 * 2) service: methods like: doGet, doPost, doDelete, etc are called.
 * 		Can be called multiple times for a single instance, because the web container does not immediately destroy
 * 		the instance if it doesn;t have to
 * 3) destroy: called once at the end of the servlet lifecycle. May decide to destroy an instance of a servlet 
 * 		if left idle. Also called "finalized".
 * 
 *
 */

public class ServletLifecycle extends HttpServlet {

	private static final long serialVersionUID = -926249345578159506L;

	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}



}
