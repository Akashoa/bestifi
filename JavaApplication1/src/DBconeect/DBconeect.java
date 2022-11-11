package DBconeect;
import java.sql.*;


public class DBconeect {
    
     static Connection conn;
  
     
  public static Connection dbconnect(){
    
    try{
        //load the driver
        Class.forName("com.mysql.jdbc.Driver");
        
        //Creat a connection
        String url="jdbc:mysql://localhost:3306/bestifi";
        String user="root";
        String password="bestifi";
        conn=DriverManager.getConnection(url,user,password);
       
        
        
        
        
    }
    catch(Exception e){
        e.printStackTrace();
       
    }
     return conn;
    }
}
