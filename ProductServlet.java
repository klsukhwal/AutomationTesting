package com.productdetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class StudentDAO
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// reading form values
		int Quantity = Integer.parseInt(request.getParameter("Quantity"));
		int Price = Integer.parseInt(request.getParameter("Price"));
		String Pname = request.getParameter("Pname");
		String Cname = request.getParameter("Company");
	
		PrintWriter out= response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("Pname", Pname);
		session.setAttribute("Company", Cname);
		session.setAttribute("Quantity", Quantity);
		session.setAttribute("Price", Price);
		out.print("<h1>Click to See the enter details by you</h1>");
		out.print("<a href='index.jsp'><button> Display the record that you are entered</button></a>");
	}

}