package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdatabase {

	public static String host="localhost";
	public static String port="3306";
	public static String Password ="Macbook@123";

	   public static void main(String[] args) throws SQLException {
		   
		    String host="localhost";
			String port="3306";
			Connection con=DriverManager.getConnection("jdbc:mysql://" +host+ ":"+port+"", "root", "Macbook@123");	
		    Statement stmt= con.createStatement();
		       
		     String sql = "CREATE DATABASE NEWSTUDENTS244";
	         stmt.executeUpdate(sql);	        
	         System.out.println("Database created successfully...");    
	         
	         
//	         String sql1 = "DROP DATABASE NEWSTUDENTS1";
//	          stmt.executeUpdate(sql1);
//	         System.out.println("Database dropped successfully...");  
	         
 	  
	  
	   }

}
