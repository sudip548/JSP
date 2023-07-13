package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class AltConnection2 {
public static void main(String[] args) {
	try {
	Class .forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/m11_e4";
	Properties pro= new Properties();
	pro.setProperty("user","root");
	pro.setProperty("password","sudipu");
	Connection connection=DriverManager.
	 		   getConnection(url,pro);
	System.out.println("connected");
	connection.close();
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
