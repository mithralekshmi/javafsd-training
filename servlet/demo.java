package com.ust.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo
 */
@WebServlet("/demo")
public class  demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;
	

 
     
    public void init() throws ServletException {
    	message ="Hello world";
    	
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath())
		
		//response.getwriter().println("<h1>HELLO WORLD</h1>");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		 out.println("<h1>" + message +"</h1>");
		 
		
	}
	
	 
    public void destroy() {
    	//do nothing
	}
	}
	


