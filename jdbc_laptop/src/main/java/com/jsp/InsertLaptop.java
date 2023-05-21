package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertLaptop {

	public static void main(String[] args)throws Exception {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_laptop","root","root");
		
		Statement st = con.createStatement();
		
		st.execute("insert into laptop values(2,'16GB','512SSD','ASUS','4000000')");
		
		st.close();
		con.close();

	}

}
