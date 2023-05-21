package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetUser {

	public static void main(String[] args)throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_user","root","root");
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery("select * from user");
        
         
        
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }
        st.close();
        con.close();

	}

}
