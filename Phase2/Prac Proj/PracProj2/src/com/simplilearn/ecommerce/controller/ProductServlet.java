package com.simplilearn.ecommerce.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out =	response.getWriter();
	
		out.print("Welcome to Product Servlet");
	
		String action =	request.getParameter("action");
	
		
	
		switch (action) {
		case "add":
			
				response.sendRedirect("views/add.jsp");
			
			break;

		case "update":
			
			response.sendRedirect("views/update.jsp");
		
		break;
			
		

		case "delete":
			
			response.sendRedirect("views/delete.jsp");
		
		break;
			
		case "get":
			
			response.sendRedirect("views/get.jsp");
		
		break;
		
		case "getall":
			
			response.sendRedirect("views/success.jsp");
		
		break;
		default:
			break;
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
