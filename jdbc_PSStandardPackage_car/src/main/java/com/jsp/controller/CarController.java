package com.jsp.controller;

import java.util.Scanner;

import com.jsp.dao.CarDao;
import com.jsp.dto.Car;

public class CarController {

	public static void main(String[] args)throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Insert Car");
		System.out.println("2. Update Car");
		System.out.println("3. Gelete Car");
		System.out.println("4. GetSingle Car by id");
		System.out.println("5. Get All Car ");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the id of Car");
			int id = sc.nextInt();
			System.out.println("Enter the Brand of Car");
			String brand = sc.next();
			System.out.println("Enter the color of Car");
			String color = sc.next();
			System.out.println("Enter the price of car");
			double price = sc.nextDouble();
			Car car = new Car();
			car.setCarId(id);
			car.setCarBrand(brand);
			car.setCarColor(color);
			car.setCarPrice(price);
			CarDao cardao = new CarDao();
			cardao.insertCar(car);
			break;
		case 2:
			System.out.println("Enter the id of car for update");
			int id2 = sc.nextInt();
			System.out.println("Enter the new brand , color and price");
			String brand1 = sc.next();
			String color1 = sc.next();
			double price1 = sc.nextDouble();
			Car car1 = new Car();
			car1.setCarId(id2);
			car1.setCarBrand(brand1);
			car1.setCarColor(color1);
			car1.setCarPrice(price1);
			 CarDao cardao1 = new CarDao();
			 cardao1.updateCar(car1);
			break;
		case 3:
			System.out.println("enter the id for delete car");
			int id3 = sc.nextInt();
			 CarDao cardao2 = new CarDao();
			 cardao2.deleteCar(id3);
			break;
		case 4:
			System.out.println("enter the id and get single car deletail");
			int id4 = sc.nextInt();
			 CarDao cardao3 = new CarDao();
			 cardao3.getCar(id4);
			break;
		case 5:
			 CarDao cardao4 = new CarDao();
			 cardao4.getAllCar();
			 break;
		default:
			System.out.println("No choice matched");
		}
	}

}
