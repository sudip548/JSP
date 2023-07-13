package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AltConnection {
public static void main(String[] args) {
	try {
Class .forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/m11_e4?"
		+ "user=root&password=sudipu";
	
	Connection connection=DriverManager.
	 		   getConnection(url);
	System.out.println("connected");
	connection.close();
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
   }
}
