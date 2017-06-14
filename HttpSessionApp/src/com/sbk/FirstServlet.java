package com.sbk;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
		String uname = request.getParameter("uname");
		String uage = request.getParameter("uage");
		
		// prepare or Create HttpSession Object
		HttpSession session = request.getSession();
		
		// set or add the request details or data in to HttpSession object
		session.setAttribute("uname", uname);
		session.setAttribute("uage", uage);
		
		// forward  request to next form i.e form2.html
		
		// RequestDispatcher object is required
		RequestDispatcher dispatcher = request.getRequestDispatcher("form2.html");
		// then forward request to form2.html by using forward mechanism
		dispatcher.forward(request, response);
	}

}
