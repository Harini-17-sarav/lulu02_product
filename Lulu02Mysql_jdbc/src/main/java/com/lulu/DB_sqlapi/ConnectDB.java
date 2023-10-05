package com.lulu.DB_sqlapi;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectDB {
	static Connection connection;

	 

	//Write the Logic for connections to be ready and Available

 

	//user name ,Password ,url for 3rd party tool

 

	static Connection setupConnection() {

 

	try {

		 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up

         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/harini17","root", "HariNi_17");

	}

	catch(Exception E) {	

 

	}

 	return connection;

  }

}


