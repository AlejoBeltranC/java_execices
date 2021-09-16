
package Controller;

import Model.MovieModel;
import Model.QuerysMovie;
import View.ViewMain;

/**
 *
 * @author alejo
 */
public class Main {
    
    public static void main(String[] args) {
        
        MovieModel movie   = new MovieModel();
        QuerysMovie movieQ = new QuerysMovie();
        ViewMain movieV    = new ViewMain();
        
        
        
        MovieController movieC = new MovieController(movieV,movie,movieQ);
    }
    
}

