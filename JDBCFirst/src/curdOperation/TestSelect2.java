package curdOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect2 {
	public static void main(String[] args) {
		try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/m11_e4";
  	String user="root";
  	String pass="sudipu";
  	Connection connection=DriverManager.
 		   getConnection(url,user,pass);
  	 Statement statement=connection.createStatement();
  	 
  	 String query="SELECT*FROM student";
  	 //for getting the data
//  	 boolean res=statement.execute(query);
//  	 ResultSet set=statement.getResultSet();
  	 
  	 //or
  	 ResultSet set = statement.executeQuery(query);
  	 
  	 
  	 System.out.println(set);
  	while( set.next()) {
  	 int id= set.getInt(1);
  	 String name=set.getString(2);
  	String email=set.getString(3);
  	String course=set.getString(4);
  	
  	System.out.println(id);
  	System.out.println(name);
  	System.out.println(email);
  	System.out.println(course);
     System.out.println("----------------------------------");
  	}
  	set.close();
  	statement.close();
  	
  	 connection.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
