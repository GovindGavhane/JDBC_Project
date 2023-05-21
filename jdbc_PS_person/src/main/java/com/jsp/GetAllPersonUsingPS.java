package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetAllPersonUsingPS {

	public static void main(String[] args)throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PS_person","root","root");
		PreparedStatement st = con.prepareStatement("select * from person");
		ResultSet s = st.executeQuery();
		while(s.next())
		{
			System.out.println(s.getInt(1)+" "+s.getString(2)+" "+s.getString(3)+" "+s.getLong(4));
		}
		st.close();
		con.close();

	}

}
