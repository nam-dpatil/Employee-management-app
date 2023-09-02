package com.employeeapp.Dao;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.employeeapp.Modal.Employee;



public class Dao {
	public static void connectionToDB(Employee employee)
	{
		String query="INSERT INTO `emp`.`employee` (`name`, `contact`, `email`, `gender`) VALUES (?,?,?,?);\r\n"
				+ ";";
		Connection con=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setString(1, employee.getName());
			
			pstmt.setLong(2,employee.getContact());
			
			pstmt.setString(3, employee.getEmail());
			
			pstmt.setString(4, employee.getGender());
			
			pstmt.executeUpdate();
			
			con.close();
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteEmployee(int id)
	{
		String query="delete from employee where id="+id;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			Statement statement=con.createStatement();
			statement.executeUpdate(query);
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteEmployee(String name)
	{
		String query="delete from employee where name="+"'"+name+"'";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			Statement statement=con.createStatement();
			statement.executeUpdate(query);
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deleteEmployee(long contact)
	{
		String query="delete from employee where contact="+contact;
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
			Statement statement=con.createStatement();
			statement.executeUpdate(query);
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
