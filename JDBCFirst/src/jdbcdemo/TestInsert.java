package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) {
		try {
     Class.forName("com.mysql.cj.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/m11_e4";
 	String user="root";
 	String pass="sudipu";
 	
 Connection connection=DriverManager.getConnection(url,user,pass);
 System.out.println("conneted");
 Statement statement=connection.createStatement();
 String query="INSERT INTO student VALUES"
              +"(7,'mantu','man@gmail.com','java')";
 boolean execute=statement.execute(query);
 System.out.println(execute);
 connection.close();
 		
	}catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	}
}
