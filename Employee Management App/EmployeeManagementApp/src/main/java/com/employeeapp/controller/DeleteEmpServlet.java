package com.employeeapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.Dao.Dao;


@WebServlet("/DeleteEmpServlet")
public class DeleteEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=0;
		String name="";
		long contact=0;
		if(!request.getParameter("delete_id_row").equals(""))
		{		
				id=Integer.parseInt(request.getParameter("delete_id_row"));
		}
		else if(!request.getParameter("delete_contact_row").equals(""))
		{
			contact=Long.parseLong(request.getParameter("delete_contact_row"));
		}
		else{
			name=request.getParameter("delete_name_row");
		}
		
		
		if(contact>9000000){
			Dao.deleteEmployee(contact);
		}
		else if(id!=0 && id<9000000)
		{
			Dao.deleteEmployee(id);
		}
		else{
			Dao.deleteEmployee(name);
		}
		
		response.setContentType("text/html");
		
		response.getWriter().print("<div style=\"background-color:blue; opacity: 0.5; height: 80px;\"><h1 style=\"background-color:aqua ;"
				+ " color:  rgb(7, 7, 1);  opacity: 0.9; text-align: center; margin-left: 15%; margin-right: 15%; padding-top: 20px; \">"
				+ "employee row deleted successfully</h1></div>");
		
		request.getRequestDispatcher("/index.html").include(request, response);

	}
}
