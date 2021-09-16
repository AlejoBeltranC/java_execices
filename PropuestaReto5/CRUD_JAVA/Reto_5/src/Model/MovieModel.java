
package Model;

/**
 * 
 * @author alejo
 * this class represent the entity Movie established on the DB "Contenidos". 
 */
public class MovieModel {
    //Atributes.
    private String title,abstract_movie,director;
    private int year;
    
    //Constructor.
    public MovieModel(){
        
    }
    public MovieModel(String title){
        this.title = title;
    }
    
    public MovieModel(String title,String abstract_movie,String director,int year  ){
        this.title          = title;
        this.abstract_movie = abstract_movie;
        this.director       = director;
        this.year           = year;
    }
    
    /**
     *
     * @return MovieModel.title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title of type String,
     * overwrite the value of MovieModel.title. 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return MovieModel.abstract_movie of type String.
     */
    public String getAbstract_movie() {
        return abstract_movie;
    }

    /**
     *
     * @param abstract_movie of type String, 
     * overwrite MovieModel.abstract_movie
     */
    public void setAbstract_movie(String abstract_movie) {
        this.abstract_movie = abstract_movie;
    }

    /**
     *
     * @return MovieModel.director of type String.
     */
    public String getDirector() {
        return director;
    }

    /**
     *
     * @param director of type String.
     * overwrite MovieModel.director 
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     *
     * @return MovieModel.year of type Int.
     */
    public int getYear() {
        return year;
    }

    /**
     *
     * @param year of type int.
     * overwrite MovieModel.year.
     */
    public void setYear(int year) {
        this.year = year;
    }

}
