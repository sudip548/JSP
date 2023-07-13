package dynamicCURDOperation;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;

import java.sql.Statement;


public class DataBaseOperator {
public static void main(String[] args) {
	try {
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    String url="jdbc:mysql://localhost:3306/m11_e4";
	  	FileInputStream stream=new FileInputStream("mydbinfo.properties");
	  	Properties pro= new Properties();
	  	pro.load(stream);
	  	Connection con =DriverManager.getConnection(url,pro);
	  	Statement stm=con.createStatement();
	  	System.out.println("Enter The Query");
	  	BufferedReader read=
	  	new BufferedReader(new InputStreamReader(System.in));
	  	String query=read.readLine();
	  	
	  	boolean res= stm.execute(query);
	  	
	  	if(res) {
	  		ResultSet set =stm.getResultSet();
	  		while(set.next()) {
	  			System.out.println(set.getObject(1));
	  			System.out.println(set.getObject(2));
	  			System.out.println(set.getObject("email"));
	  			System.out.println(set.getObject(4));
	  			System.out.println("----------------------");

	  		}
	  		
	  	}else {
  			System.out.println("Tabel updated Sucessfully");

	  	}
	  			
	  			
	}catch(ClassNotFoundException |IOException| SQLException e) {
		e.printStackTrace();
	}
	}

}
