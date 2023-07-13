package curdOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			   String url="jdbc:mysql://localhost:3306/sudip24";
			  	String user="root";
			  	String pass="sudipu";
			  	Connection connection=DriverManager.
			 		   getConnection(url,user,pass);
			  	String query ="insert into image(pic) values(?)";
			  	PreparedStatement ps = connection.prepareStatement(query);
			  	
			  	FileInputStream fis = new FileInputStream("lib/pic.jpg");
			  	ps.setBinaryStream(1, fis, fis.available());
			  	
			  	ps.executeUpdate();
			  	connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
