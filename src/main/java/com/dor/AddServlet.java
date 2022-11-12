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

	
		req.setAttribute("sum", sum);
	
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);

		/*
		 * PrintWriter out = res.getWriter(); out.println("The sum of " + num1 + " and "
		 * + num2 + " is " + sum);
		 */
	}
}
