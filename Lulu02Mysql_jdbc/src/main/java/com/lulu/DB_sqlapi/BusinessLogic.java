package com.lulu.DB_sqlapi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class BusinessLogic {
	void createData() throws SQLException {

		Connection connection = ConnectDB.setupConnection();

		String query ="INSERT INTO Product456 ( id, name, cost, description ) VALUES( ?,?,?,?)";

 

//		String query = "insert values into employee(? ,? ,?) ";

		PreparedStatement myStmt = connection.prepareStatement(query);

		 

		myStmt.setInt(1, 6);

 

		myStmt.setString(2, "Lipstick");

 

		myStmt.setInt(3, 120);

 

		myStmt.setString(4, "very friendly");


		int success = myStmt.executeUpdate();
		
		System.out.println("Added Successfully " + success);

 
     	}

 

		void readData() throws SQLException {

 

			Connection connection=ConnectDB.setupConnection();

 
			 java.sql.Statement statement;

 

			 statement = connection.createStatement();

 

	         ResultSet resultSet;

 

	         resultSet = statement.executeQuery("select * from Product456 where id>=1");

 

	         int id;

	         String name;
	         
	         int cost;

	         String description;

 

	         while (resultSet.next()) {

 

	             id = resultSet.getInt("id");

 

	             name = resultSet.getString("name");

 

	             cost = resultSet.getInt("cost");
	             
	             
	             description = resultSet.getString("description");
	             

	             System.out.println("id : " + id  + " name : " +  name  + " cost: " +  cost  + " description: " +  description );

 
	         }
	               
	         
		}
		
}
 

             

		
		

		