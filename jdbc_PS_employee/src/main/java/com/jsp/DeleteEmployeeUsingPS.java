package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEmployeeUsingPS {

	public static void main(String[] args)throws Exception {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the id of employee for delete");
     int id = sc.nextInt();
     Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PS_employee","root","root");
		PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
		ps.setInt(1, id);
		int s=ps.executeUpdate();
		System.out.println(s+" Employe deleted sucessfully");
		ps.close();
		con.close();
     

	}

}
