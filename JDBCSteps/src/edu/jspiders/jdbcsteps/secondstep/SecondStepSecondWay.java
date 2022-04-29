package edu.jspiders.jdbcsteps.secondstep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondStepSecondWay
{
	public static void main(String[] args)
	{
		try 
		{
			//1.Load the Drivers
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Drivers Loaded!!!!");
			
			//2.Get the Connections 
			String dburl = "jdbc:mysql://localhost:3306/hejm33_db";
			Connection con = DriverManager.getConnection(dburl,"root","root");
			
			if(con != null)
				System.out.println("Connections Established!!!");
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
