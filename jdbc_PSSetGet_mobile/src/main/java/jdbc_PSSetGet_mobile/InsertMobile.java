package jdbc_PSSetGet_mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertMobile {

	public static void main(String[] args)throws Exception {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the id of Mobile");
		 int id = sc.nextInt();
		 System.out.println("Enter the name of Mobile");
		 String name=sc.next();
		 System.out.println("Enter the RAM of Mobile");
		 String ram = sc.next();
		 System.out.println("Enter the storage of Mobile");
		 String storage = sc.next();
		 Mobile mobile = new Mobile();
		 mobile.setMobileId(id);
		 mobile.setMobileName(name);
		 mobile.setMobileRam(ram);
		 mobile.setMobileRom(storage);
		 insertMobile(mobile);
	}
	
	public static void insertMobile(Mobile mobile)throws Exception
	{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PSSetGet_mobile","root","root");
		 PreparedStatement ps=con.prepareStatement("insert into mobile values(?,?,?,?)");
		 ps.setInt(1, mobile.getMobileId());
		 ps.setString(2,mobile.getMobileName());
		 ps.setString(3,mobile.getMobileRam());
		 ps.setString(4, mobile.getMobileRom());
		 ps.execute();
		 System.out.println("data enter the sucessfully");
		 ps.close();
		 con.close();

	}

}
