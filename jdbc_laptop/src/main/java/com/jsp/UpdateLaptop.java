package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateLaptop {

	public static void main(String[] args)throws Exception {

     Class.forName("com.mysql.cj.jdbc.Driver");
     
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_laptop","root","root");
     
     Statement st =con.createStatement();
     
     int i = st.executeUpdate("update laptop set ram='12GB',harddisc='128SSD' where id=2");
     
     st.close();
     con.close();
     System.out.println(i);

	}

}
