package com.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jsp.dto.Car;

public class CarDao {
	
	public static void insertCar(Car car)throws Exception
	{
		PreparedStatement ps = getConnection().prepareStatement("insert into car values(?,?,?,?)");
		ps.setInt(1, car.getCarId());
		ps.setString(2, car.getCarBrand());
		ps.setDouble(3, car.getCarPrice());
		ps.setString(4, car.getCarColor());
		ps.execute();
		System.out.println("data inserted Successfully");
		ps.close();
	}
	public static void updateCar(Car car)throws Exception
	{
		 PreparedStatement ps=getConnection().prepareStatement("update car set  name=?,price=?,color=? where id=?");
		  ps.setString(1, car.getCarBrand());
		  ps.setDouble(2,car.getCarPrice());
		  ps.setString(3, car.getCarColor());
		  ps.setInt(4, car.getCarId());
		  int i= ps.executeUpdate();
		 System.out.println(i+"data update the sucessfully");
		 ps.close();
	}
	public static void deleteCar(int id)throws Exception
	{
		 PreparedStatement ps=getConnection().prepareStatement("delete from car where id=?");
		 ps.setInt(1, id);
		 int s = ps.executeUpdate();
		 System.out.println(s+" deleted suceessfully");
		 ps.close();

	}
	public static void getCar(int id)throws Exception
	{
		 PreparedStatement ps=getConnection().prepareStatement("select * from car where id=?");
		 ps.setInt(1, id);
		 ResultSet rs = ps.executeQuery();
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		 }
		 ps.close();
	}
	public static void getAllCar()throws Exception
	{
		 PreparedStatement ps=getConnection().prepareStatement("select * from car");
		 ResultSet rs = ps.executeQuery();
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		 }
		 ps.close();
	}
	
	public static Connection getConnection()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_PSStandardPackage_car","root","root");
		return con;
	}

}
