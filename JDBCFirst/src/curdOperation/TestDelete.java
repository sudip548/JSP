package curdOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) {
		try {
   Class.forName("com.mysql.cj.jdbc.Driver");
   String url="jdbc:mysql://localhost:3306/m11_e4";
  	String user="root";
  	String pass="sudipu";
  	Connection connection=DriverManager.
 		   getConnection(url,user,pass);
  	 Statement statement=connection.createStatement();
  	 String query="DELETE FROM student WHERE id=6";
  	 int res=statement.executeUpdate(query);
  	 System.out.println(res);
  	 connection.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
