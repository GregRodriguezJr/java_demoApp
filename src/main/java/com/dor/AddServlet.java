package com.dor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));

		int sum = num1 + num2;
		
		/* Prints to browser the sum with AddServlet */
		/*
		 * PrintWriter out = res.getWriter(); out.println("The sum of " + num1 + " and "
		 * + num2 + " is " + sum);
		 */

		/* Call SqServlet from this AddServlet and pass the sum as attribute */
	
		/* req.setAttribute("sum", sum); */
	
		/*
		 * Dispatcher used to call 2nd servlet from 1st servlet that was trigger by
		 * client/browser using req and res objects
		 */
		
		/*
		 * RequestDispatcher rd = req.getRequestDispatcher("sq"); rd.forward(req, res);
		 */
		
		res.sendRedirect("sq?sum=" + sum);
		

	}
}
