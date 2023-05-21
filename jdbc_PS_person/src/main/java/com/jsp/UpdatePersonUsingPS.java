package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdatePersonUsingPS {

	public static void main(String[] args)throws Exception {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the id of person for update");
		 int id = sc.nextInt();
		 System.out.println("Enter the name and phone of person");
		 String name=sc.next();
		 long phone = sc.nextLong();
 		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PS_person","root","root");
		 PreparedStatement ps = con.prepareStatement("update person set name=?,phone=? where id=?");
		 ps.setString(1, name);
		 ps.setLong(2, phone);
		 ps.setInt(3, id);
		 int s = ps.executeUpdate();
		 System.out.println(s+" updated");
		 ps.close();
		 con.close();

	}

}
