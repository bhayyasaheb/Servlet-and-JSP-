package com.sbk;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
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
		
		// get the request details
		String uqual = request.getParameter("uqual");
		String udesig = request.getParameter("udesig");
		
		// prepare cookies for this
		Cookie cookie3 = new Cookie("uqual",uqual);
		Cookie cookie4 = new Cookie("udesig",udesig);
		
		// add cookies into response object
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		
		// forward request to 3 form
		RequestDispatcher dispatcher= request.getRequestDispatcher("form3.html");
		dispatcher.forward(request, response);
	}

}
