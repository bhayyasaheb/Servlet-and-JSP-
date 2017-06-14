package com.sbk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// all request details are coming from client browser this request details is stored in request object
		
		// general setting 
		
		// it explain which type of content sends to the client browser 
		// and now we are sending text/html data now hold the data
		response.setContentType("text/html");
		
		// initially response object is empty 
		// to add response in to response object we are using java object like printWriter
		// we get the PrintWriter object as below display
		PrintWriter writer = response.getWriter();
		
		// by using printwriter object (writer) we able to write data to the response object
		
		writer.println("This is my first Application!");
		writer.println("<br>");
		writer.println("This is get request!");
		
		// retrieve the request data gathering logic 
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		// business logics 
		if(uname.equals("Bhayyasaheb") && upwd.equals("SBK"))
		{
			writer.println("Login Success");
	     	writer.println("User Name : "+uname);
			writer.println("User Password : "+ upwd);
			
			// Request Redirect by using hyperlink
			//writer.println("<a href= 'https://www.facebook.com'> Click here to RR  to fb </a>");
			
			//Request Redirect by using response header
			//response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
			//response.setHeader("location", "https://www.facebook.com");
			
			// Request Redirect by using send redirect
			response.sendRedirect("https://www.facebook.com");
		}
		else
		{
			//writer.println("Login Failed!");
			// when user name and password is invalid then we gives error message with status code and description 
			// for that we are using send Error mechanism
			response.sendError(880, "OOPs! User name and Password is Wrong");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
