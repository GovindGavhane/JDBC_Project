package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUser {
	
	public static void main(String[] args)throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_user","root","root");
		Statement st = con.createStatement();
	    int s =st.executeUpdate("update user set name='ram',password='456' where id=1");
	    st.close();
	    con.close();
	}

}
