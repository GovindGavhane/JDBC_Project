package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUser {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_student","root","root");
		Statement st = con.createStatement();
		int o = st.executeUpdate("delete from student where id=1");
		st.close();
		con.close();
		System.out.println(o);
	}

}
