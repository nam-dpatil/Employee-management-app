package com.employeeapp.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.Dao.Dao;
import com.employeeapp.Modal.Employee;





@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullName=request.getParameter("fullName");
		
		long contact=Long.parseLong(request.getParameter("contact"));
		
		String email=request.getParameter("email");
		
		String gender=request.getParameter("gender");
		
		Employee employee=new Employee(fullName,contact,email,gender);
		Dao.connectionToDB(employee);
		
		response.setContentType("text/html");
		
		response.getWriter().print("<div style=\"background-color:blue; opacity: 0.5; height: 80px;\"><h1 style=\"background-color:aqua ;"
				+ " color:  rgb(7, 7, 1);  opacity: 0.9; text-align: center; margin-left: 15%; margin-right: 15%; padding-top: 20px; \">"
				+ "empoyee register succefully</h1></div>");
		
		request.getRequestDispatcher("/index.html").include(request, response);
		
		
		
	}

}
