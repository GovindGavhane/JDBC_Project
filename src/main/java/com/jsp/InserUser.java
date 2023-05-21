package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InserUser {
	
	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_user","root","root");
		Statement st = con.createStatement();
		st.execute("insert into user values(2,'ram','1121')");
		st.close();
		con.close();
		
	}

}
