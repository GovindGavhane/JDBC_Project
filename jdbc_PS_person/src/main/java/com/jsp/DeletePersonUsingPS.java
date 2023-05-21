package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletePersonUsingPS {

	public static void main(String[] args)throws Exception {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the id for delete the person");
     int id = sc.nextInt();
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PS_person","root","root");
     PreparedStatement ps = con.prepareStatement("delete from person where id=?");
     ps.setInt(1, id);
     int d = ps.executeUpdate();
     System.out.println(d+" person delete sucessfully");
     ps.close();
     con.close();

	}

}
