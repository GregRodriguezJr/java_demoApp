package com.dor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		/* Pass the sum from AddServlet and print on the browser using response object */
		
		
		/* int sum = (int)req.getAttribute("sum"); */ 
		 
		 int sum = Integer.parseInt(req.getParameter("sum"));
		 
		 int square = sum * sum; PrintWriter
		 
		 out = res.getWriter(); 
		 
		 out.println("Square is: " + square);
		 
		
		System.out.println("sq called");
	}
}
