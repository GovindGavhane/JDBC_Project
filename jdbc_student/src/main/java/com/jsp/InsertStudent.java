package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudent {
	
	public static void main(String[] args)throws Exception {
		
		// load and resister driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_student","root","root");
		
		//create the stastment
		
		Statement st = con.createStatement();
		
		// Execute Query
		
		st.execute("insert into student values(1,'kam',775434334)");
		
		// close the statement
		
		st.close();
		con.close();
		
	}

}
