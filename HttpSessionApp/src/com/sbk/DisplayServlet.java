package com.sbk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// to display all the details we want response type also
		
		//general setting 
		response.setContentType("text/html");
		
		//add response in response object
		PrintWriter writer = response.getWriter();
		
		// get request details
		String mobile = request.getParameter("umobile");
		String email  = request.getParameter("uemail");
		
		// create Session object
		HttpSession session =  request.getSession(false);
		
		// print all the details of client ---6 	2--req		4-session
		
		//  4 request details from session object 
		writer.println("User Name :" + session.getAttribute("uname"));
		writer.println("<br>");
		writer.println("User Age : " + session.getAttribute("uage"));
		writer.println("<br>");
		writer.println("User Qualification : " + session.getAttribute("uqual"));
		writer.println("<br>");
		writer.println("User Designation : " + session.getAttribute("udesig"));
		writer.println("<br>");
		 
		// 2 request details directly here
		writer.println("User Mobile No : " + mobile);
		writer.println("<br>");
		writer.println("User Emaid Id : " + email);
		writer.println("<br>");
	
	}

}
