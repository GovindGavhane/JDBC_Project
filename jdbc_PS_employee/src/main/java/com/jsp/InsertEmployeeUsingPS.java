package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertEmployeeUsingPS {

	public static void main(String[] args)throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id of employee");
		int id = sc.nextInt();
		System.out.println("Enter the name of employee");
		String name = sc.next();
		System.out.println("Enter the phone of employee");
		long phone = sc.nextLong();
		System.out.println("Enter the email of employee");
		String email = sc.next();

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PS_employee","root","root");
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setLong(3, phone);
		ps.setString(4, email);
		ps.execute();
		System.out.println("Employe inserted sucessfully");
		ps.close();
		con.close();
		
	}

}
