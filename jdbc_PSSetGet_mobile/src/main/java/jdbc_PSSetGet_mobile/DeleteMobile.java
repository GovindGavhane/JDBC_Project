package jdbc_PSSetGet_mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteMobile {

	public static void main(String[] args)throws Exception {

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the id of mobile for delete ");
     int id = sc.nextInt();
     Mobile mobile = new Mobile();
     mobile.setMobileId(id);
     deleteMobile(mobile);
    

	}
	public static void deleteMobile(Mobile mobile)throws Exception
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PSSetGet_mobile","root","root");
		 PreparedStatement ps=con.prepareStatement("delete from mobile where mobileId=?");
		 ps.setInt(1, mobile.getMobileId());
		int i= ps.executeUpdate();
		 System.out.println(i+"data deleted the sucessfully");
		 ps.close();
		 con.close();
	}

}
