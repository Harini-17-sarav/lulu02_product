package com.lulu.databases;
public class MydatabaseConnect {
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	//JDBC API
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
        
        Statement statement;
        statement = connection.createStatement();
        ResultSet resultSet;
        resultSet = statement.executeQuery(
            "select * from employee");
        int id;
        String name;
        String dept;
        while (resultSet.next()) {
            id = resultSet.getInt("id");
            name = resultSet.getString("name");
            dept=resultSet.getString("dept");
            System.out.println("id : " + id
                               + " name : " + name +"  departmet:"+ dept);
        }




		}catch(Exception E) {

		

	}


