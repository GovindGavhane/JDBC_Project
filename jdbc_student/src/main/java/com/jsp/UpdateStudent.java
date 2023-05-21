package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudent {
	
	public static void main(String[] args)throws Exception {
		
		// load and register driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish the connection 
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_student","root","root");
		
		//create the statement
		
		Statement st = con.createStatement();
		
		// execute query
		
		int i = st.executeUpdate("update student set name='tatya',phone=0000000 where id=2");
		
		// close the connection
		st.close();
		con.close();
		System.out.println(i);
	}

}
