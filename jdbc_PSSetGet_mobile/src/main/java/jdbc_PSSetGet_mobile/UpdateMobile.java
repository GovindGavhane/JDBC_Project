package jdbc_PSSetGet_mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateMobile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the id of Mobile for update");
		 int id = sc.nextInt();
		 System.out.println("Enter the Name , RAM and ROM of Mobile");
		 String name=sc.next(); 
		 String ram = sc.next();
		 String rom=sc.next();
		 Mobile mobile = new Mobile();
		 mobile.setMobileId(id);
		 mobile.setMobileName(name);
		 mobile.setMobileRam(ram);
		 mobile.setMobileRom(rom);
		 try
		 {
		 updateMobile(mobile);
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
	}
	public static void updateMobile(Mobile mobile)throws Exception
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PSSetGet_mobile","root","root");
		 PreparedStatement ps=con.prepareStatement("update mobile set mobileName=?,mobileRam=?,mobileStorage=? where mobileId=?");
		 ps.setString(1,mobile.getMobileName());
		 ps.setString(2,mobile.getMobileRam());
		 ps.setString(3, mobile.getMobileRom());
		 ps.setInt(4, mobile.getMobileId());
		int i= ps.executeUpdate();
		 System.out.println(i+"data update the sucessfully");
		 ps.close();
		 con.close();
	}

}
