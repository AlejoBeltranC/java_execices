
package Model;

/**
 *
 * @author alejo
 */
public interface MoviesDAO {
    //add a new object at the DB.
    public boolean create(MovieModel movie);
    //show a data specific  of the DB.
    public boolean read(MovieModel movie);
    //update one  data of the DB. 
    public boolean update(MovieModel movie);
    //delete one registration on the DB.
    public boolean delete(MovieModel movie);
}
