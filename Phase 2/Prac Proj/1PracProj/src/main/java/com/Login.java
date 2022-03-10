package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		RequestDispatcher rd=null;
		if(username.equalsIgnoreCase("tom") && password.equals("jerry")) {
			rd=request.getRequestDispatcher("logout.html");
			rd.forward(request, response);
			
			
		}else if(username.equalsIgnoreCase("abcd") && password.equals("efgh")) {
			rd=request.getRequestDispatcher("logout.html");
			rd.forward(request, response);
		}else if(username.equalsIgnoreCase("efgh") && password.equals("ijkl")) {
			rd=request.getRequestDispatcher("logout.html");
			rd.forward(request, response);
		}else if(username.equalsIgnoreCase("ijkl") && password.equals("mnop")) {
			rd=request.getRequestDispatcher("logout.html");
			rd.forward(request, response);
		}else if(username.equalsIgnoreCase("mnop") && password.equals("qrst")) {
			rd=request.getRequestDispatcher("logout.html");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("index.html");
			PrintWriter out= response.getWriter();
			rd.include(request, response);
			out.println("<center><span style ='color:red'>Invalid ");
			
		}
		
		
	}

}
