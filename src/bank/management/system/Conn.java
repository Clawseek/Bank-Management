
package bank.management.system;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conn {

    
    Connection c;
    Statement s;
    public Conn()
     {
         try{
        // now register the driver
         c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Hellomini@5141");
         s = c.createStatement();
         }
         catch(Exception e)
         {
             System.out.println(e);
                  
         }
   
     }     
           
}