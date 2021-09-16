
package Model;

import static Model.DB_Connection.get_Connection;
import View.ViewMain;
import java.awt.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejo
 * 
 * this class contains methods with querys sql,this implements the interface DAO.
 * 
 */
public class QuerysMovie implements MoviesDAO{

    /**
     * this method connects with the DB predefined,adds a new registration.
     * the connection with DB will be closed at the end of the method.
     * @param movie
     * @return true, if the registration is success.or false if the registration is failed.
     * @exception SQLException, if have error the consult. 
     */
    @Override
    public boolean create(MovieModel movie) {
        
        PreparedStatement ps= null;
        
        Connection conn = get_Connection();
        String sql = "INSERT INTO pelicula(titulo,resumen,ano,director)"
                   + " VALUES(?,?,?,?)";
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getAbstract_movie());
            ps.setInt(3, movie.getYear());
            ps.setString(4, movie.getDirector());
            
            ps.execute();
            
            return true;
            
        }catch(SQLException e){
            e.printStackTrace();
            return false; 
        }
        finally{
               try{
                   conn.close();
               }catch(SQLException e){
                   e.printStackTrace();
               }
        }
        
    }

    /**
     * gets a registration with the camps titulo,resumen,año,director, where 
     * movie´s title is equal at of param.
     * @param movie of type MovieModel
     * @return true, if la search is success or false si is failed.
     * @exception SQLException, if have error the consult.
     */
    @Override
    public boolean read(MovieModel movie) {
        
        PreparedStatement ps;        
        ResultSet rs;
        Connection conn = get_Connection();        
        String sql = "SELECT titulo,resumen,ano,director FROM pelicula WHERE titulo =?";
        
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, movie.getTitle());
            rs = ps.executeQuery();

            if(rs.next()){  
                movie.setTitle(rs.getString("titulo"));
                movie.setAbstract_movie(rs.getString("resumen"));
                movie.setYear(Integer.parseInt(rs.getString("ano")));
                movie.setDirector(rs.getString("director"));
                
                return true;
            }
            return false;
            } catch(SQLException e){
                e.printStackTrace();
                return false; 
               
            } 
    }
    /**
     * gets all the records of the DB "Contenidos".
     * crates a new objects of de type MovieModel with the datas gets of the 
     * query and add in the List. 
     * @return List of type MovieModel.
     * @exception SQLException, if have error the consult.
     */
    public java.util.List<MovieModel> readAll(){
       
        java.util.List<MovieModel> MovieM = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection conn = get_Connection();
        
        String sql = "SELECT titulo,ano,resumen,director FROM pelicula";
        
        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                MovieModel Movie = new MovieModel(); 
                
                Movie.setTitle(rs.getString(1));
                Movie.setYear(Integer.parseInt(rs.getString(2)));
                Movie.setDirector(rs.getString(3));
                Movie.setAbstract_movie(rs.getString(4));
                
                MovieM.add(Movie);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return MovieM;
        
        
    }
    
    /**
     * this method contains query for update a registration on the DB.
     * @param movie of type MovieModel.
     * @return true, if la update is success or false, if is failed. 
     */

    @Override
    public boolean update(MovieModel movie) {
        
        PreparedStatement ps = null;
        Connection conn       = get_Connection();
  
        String sql = "UPDATE pelicula SET titulo =?,resumen =?,ano =? ,director =? "
                   + "WHERE titulo =?  LIMIT 1";
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, movie.getTitle());
            ps.setString(2, movie.getAbstract_movie());
            ps.setInt(3, movie.getYear());
            ps.setString(4,movie.getDirector());
            ps.setString(5, movie.getTitle());
            ps.execute();
            
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
     /**
      * this method delete a registration of tha DB.
      * end it will closed the connection with the DB.
      * @param movie of the type MovieModel
      * @return true if the registration is delete success or false if dont´n 
      * deletes registration.
      * @exception SQLException, if have error the consult.
      * 
      */
    @Override
    public boolean delete(MovieModel movie) {
        
        PreparedStatement ps = null;
        Connection conn      = get_Connection();
  
        String sql = "DELETE FROM pelicula WHERE titulo = ? LIMIT 1";
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, movie.getTitle());
            
            ps.execute();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }finally{
            try{
                conn.close();
            }catch(SQLException e){
                e.printStackTrace();
                
            }
        }
        
    }
    
}
