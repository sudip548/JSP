package dynamicCURDOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestMultiInsert {

	public static void main(String[] args) {
		try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      String url="jdbc:mysql://localhost:3306/m11_e4";
		   	String user="root";
		   	String pass="sudipu";
		   Connection connection=DriverManager.getConnection(url,user,pass);
		   
		   String query="Insert INTO student values(?,?,?,?)";
		   PreparedStatement ps=connection.prepareStatement(query);
		   
		   ps.setInt(1,101);
		   ps.setString(2, "legain");
		   ps.setString(3,"lee@gmail.com");
		   ps.setString(4, "j2ee");
		   ps.addBatch();
		   
		   ps.setInt(1,102);
		   ps.setString(2, "legain");
		   ps.setString(3,"lee@gmail.com");
		   ps.setString(4, "J2EE");
		   ps.addBatch();
		   
		   ps.setInt(1,103);
		   ps.setString(2, "legain");
		   ps.setString(3,"lee@gmail.com");
		   ps.setString(4, "J2EE");
		   ps.addBatch();
		   
		   int[] batch=ps.executeBatch();
//		   for(Integer b:batch) {
//			   System.out.println(b);
//		   }
		   
		   System.out.println(batch.length+"rows of data added");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	}

}
