package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteLaptop {

	public static void main(String[] args)throws Exception {

     Class.forName("com.mysql.cj.jdbc.Driver");
     
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_laptop","root","root");
     
     Statement st = con.createStatement();
     
     int a = st.executeUpdate("delete from laptop where id=2");
     
     st.close();
     
     con.close();
     
     System.out.println(a);

	}

}
