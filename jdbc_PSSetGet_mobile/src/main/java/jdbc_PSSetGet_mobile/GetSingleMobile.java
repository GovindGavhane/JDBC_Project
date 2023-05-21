package jdbc_PSSetGet_mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class GetSingleMobile {

	public static void main(String[] args)throws Exception {
		 
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the id of mobile for get ");
	     int id = sc.nextInt();
	     Mobile mobile = new Mobile();
	     mobile.setMobileId(id);
	     getMobile(mobile);
	    

		}
		public static void getMobile(Mobile mobile)throws Exception
		{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PSSetGet_mobile","root","root");
			 PreparedStatement ps=con.prepareStatement("select * from mobile where mobileId=?");
			 ps.setInt(1, mobile.getMobileId());
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			 }
			 ps.close();
			 con.close();
		}
	}


