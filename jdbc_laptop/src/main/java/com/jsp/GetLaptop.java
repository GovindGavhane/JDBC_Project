package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetLaptop {

	public static void main(String[] args)throws Exception {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_laptop","root","root");
		
		Statement st = con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from laptop");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		
		st.close();
		con.close();
		

	}

}
