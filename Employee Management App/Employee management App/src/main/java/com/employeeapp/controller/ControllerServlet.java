package com.employeeapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.dao.Dao;
import com.employeeapp.modal.Employee;


@WebServlet("/Controll")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println(request);
		String fullName=request.getParameter("fullName");
		System.out.println(fullName);
		System.out.println(request.getParameter("contact"));
		long contact=Long.parseLong(request.getParameter("contact"));
		System.out.println(contact +" done");
		
		String email=request.getParameter("email");
		
		String gender=request.getParameter("gender");
		System.out.println("data stored");
		
		Employee emplyee=new Employee(fullName,contact,email,gender);
		System.out.println("emp obj created");
		Dao.connectionToDB(emplyee);
		
		
	}

}
