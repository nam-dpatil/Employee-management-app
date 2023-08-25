package com.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.employee.modal.Employee;

public class Dao {
	public static void getConnection(Employee emp) throws SQLException
	{
		
		String query="insert into employee1 values(?,?,?);";
		PreparedStatement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");
			statement=connection.prepareStatement(query);
			statement.setInt(1, emp.getId());
			statement.setString(2, emp.getName());
			statement.setString(3, emp.getDesignation());
			statement.execute();
			statement.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			statement.close();
		}
	}
	
	

}
