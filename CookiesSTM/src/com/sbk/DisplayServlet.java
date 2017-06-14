package com.sbk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		// display data
		response.setContentType("text/html");
		PrintWriter  writer = response.getWriter();
		
		// get the request details
		String mobile = request.getParameter("umobile");
		String email = request.getParameter("uemail");
		
		// printing all details // 2-req	4-cookie
		
		// get all cookies 
		Cookie[] c= request.getCookies();
		
		// printing 4 cookies object
		writer.println("User Name :"+c[0].getValue());
		writer.println("<br>");
		writer.println("User Age :"+c[1].getValue());
		writer.println("<br>");
		writer.println("User Qualification :"+c[2].getValue());
		writer.println("<br>");
		writer.println("User Designation :"+c[3].getValue());
		writer.println("<br>");
		
		// printing 2 request details directly
		writer.println("User Mobile No :"+mobile);
		writer.println("<br>");
		writer.println("User Email id :"+email);
		writer.println("<br>");
	}

}
