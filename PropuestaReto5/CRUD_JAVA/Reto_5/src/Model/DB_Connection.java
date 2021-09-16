
package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alejo
 * this class allow connect to database of Mysql. 
 */
public class DB_Connection implements Credentials {
    /**
     * Connect to the database.
     * @return bool,
     * depending if connection is successful o failed.
     */
    public static Connection get_Connection(){
        
        Connection conn = null;
 
        try{
            conn = DriverManager.getConnection(Credentials.URL,Credentials.USER,Credentials.PASSWORD);
            if(conn != null){
                System.out.println("successful connection");   
                return conn; 
            }
                      
        }catch(Exception e){
            e.printStackTrace();
         }         
        return conn;
    }
    
    
}
