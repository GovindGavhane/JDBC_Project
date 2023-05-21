package jdbc_PSSetGet_mobile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetAllMobile {
	
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PSSetGet_mobile","root","root");
		PreparedStatement st = con.prepareStatement("select * from mobile");
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		st.close();
		con.close();
	}

}
