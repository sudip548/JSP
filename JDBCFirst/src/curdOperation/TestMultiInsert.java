//package curdOperation;
//
////import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class TestMultiInsert {
//	public static void main(String[] args) {
//		try {
//	      Class.forName("com.mysql.cj.jdbc.Driver");
//	      String url="jdbc:mysql://localhost:3306/m11_e4";
//	    String user="root";
//	   	String pass="sudipu";
//	   	
//	   Connection connection=DriverManager.
//			   getConnection(url,user,pass);
//	   Statement statement=connection.createStatement();
//	   String query1="INSERT INTO student VALUES(501,'karma','kar204@gmail.com,'hibernat')";
//	   String query2="INSERT INTO student VALUES(502,'karma','kar20@gmail.com,'hiberate')";
//	   String query3="INSERT INTO student VALUES(503,'karma','kar2014@gmail.com,'hibrnate')";
//	   String query4="INSERT INTO student VALUES(504,'karma','kar2040@gmail.com,'hibernate')";
//
//	   //String update="Update student set name='gopu'wherename is '"
//	   
//	   statement.addBatch(query1);
//	   statement.addBatch(query2);
//	   statement.addBatch(query3);
//	   statement.addBatch(query4);
//	   
//	   int[] batch= statement.executeBatch();
//	   System.out.println(batch.length+"rows of data added");
//
//	   connection.close();
//		}
//		catch( ClassNotFoundException | SQLException e){
//			e.printStackTrace();
//			
//		}
//	}
//}
