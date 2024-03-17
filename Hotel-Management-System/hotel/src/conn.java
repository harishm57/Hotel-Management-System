
//import java.sql.*;
//public class conn {
//	Connection c;
//	Statement s;
//	conn(){
//		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		c=DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","Harinani@20032010");
//		s=c.createStatement();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//
//}
import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","password"); 
            
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
