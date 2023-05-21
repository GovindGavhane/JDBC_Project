package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetSingleEmployeeUsingPS {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of employee for delete");
		int id = sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PS_employee", "root", "root");
		PreparedStatement ps = con.prepareStatement(" select * from employee where id=?");
		ps.setInt(1, id);
	    ResultSet rs = ps.executeQuery();
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3)+" "+rs.getString(4));
		 }
		ps.close();
		con.close();

	}

}
