package com.employeeapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employeeapp.modal.Employee;

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

}
