package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertPersonUsingPS {

	public static void main(String[] args)throws Exception {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the id of person");
		 int id = sc.nextInt();
		 System.out.println("Enter the name of person");
		 String name=sc.next();
		 System.out.println("Enter the phone of person");
		 long phone = sc.nextLong();
		 System.out.println("Enter the gmail of person");
		 String gmail = sc.next();
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PS_person","root","root");
		 PreparedStatement ps=con.prepareStatement("insert into person values(?,?,?,?)");
		 ps.setInt(1, id);
		 ps.setString(2,name);
		 ps.setString(3,gmail);
		 ps.setLong(4, phone);
		 ps.execute();
		 System.out.println("data enter the sucessfully");
		 ps.close();
		 con.close();

	}

}
