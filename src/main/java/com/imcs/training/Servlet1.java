package com.imcs.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String userName=request.getParameter("userName");
		PrintWriter print =response.getWriter();
		
	
		
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName!=null) {
		session.setAttribute("userName", userName);
		context.setAttribute("userName", userName);
		}
		print.write("<h1> Hello to "+userName+" From Request</h1>");
		print.write("<h1> Hello to "+session.getAttribute("userName")+" From Session</h1>");
		print.write("<h1> Hello to "+context.getAttribute("userName")+" From Context</h1>");
		
		//.append("Served at:GET ")
		//.append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: POST ").append(request.getContextPath());
		response.setContentType("text/html");
		String userName=request.getParameter("userName");
		PrintWriter print =response.getWriter();
		
	
		UserService service = new UserService();
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName!=null) {
		session.setAttribute("userName", userName);
		context.setAttribute("userName", userName);
		}
		print.write("<h1> Hello to "+userName+" From Request</h1>");
		print.write("<h1> Hello to "+session.getAttribute("userName")+" From Session</h1>");
		print.write("<h1> Hello to "+context.getAttribute("userName")+" From Context</h1>");
		print.write("<h1> Hello to "+context.getAttribute("userName")+"Your User id is : "+ service.lookUpUser(userName)+"</h1>");
		
		
		
	}

}
