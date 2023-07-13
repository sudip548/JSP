package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection2 {

	public static void main(String[] args) {
		try {
     Class.forName("com.mysql.cj.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/m11_e4";
 	String user="root";
 	String pass="sudipu";
 	
 Connection connection=DriverManager.getConnection(url,user,pass);
 System.out.println("conneted");
 		
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
		
	}
}
