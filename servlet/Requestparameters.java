package com.ust.example3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Requestparameters
 */
@WebServlet("/Requestparameters")
public class Requestparameters extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public String firstName;
	 public String lastName;
	 public class HTMLFilter{
		 public static String filter(String name) {
			 return name;
		 }
	 }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Request Parameters Example</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Request Parameteers Example</h3>");
		out.println("Parmeters in this request:<br> ");
		if(firstName !=null || lastName !=null) {
			out.println("First Name:");
			out.println("=" +HTMLFilter.filter(firstName)+ "<br>");
			out.println("Last Name:");
			out.println("="+HTMLFilter.filter(lastName));
		}
		else {
			out.println("No Parameters, Please, Please enter some");
		
		}
		out.println("<p>");
		out.println("<form action=\"");
		out.println("RequestParamExample\"");
		out.println("<method=POST>");
		out.println("First Name:");
		out.println("<input type=text size=20 name=firstname>");
		out.println("<br>");
		out.println("Last Name:");
		out.println("<input type=text size=20 name=lastname>");
		out.println("<br>");
		out.println("<input type=submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		
			
		}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
