package com.lulu.DB_sqlapi;
import java.sql.SQLException;
public class TestController {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		BusinessLogic bl= new BusinessLogic();

		 

		bl.createData();
		
		bl.readData();

	    //bl.deleteData();

	    //bl.updateData();

		//bl.batchProcess();
		
		//bl.TransactionsConcepts();

	   // bl.StoredProceduresMore();


	}

}
