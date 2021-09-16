
package Controller;

import Model.MovieModel;
import Model.QuerysMovie;
import View.ViewMain;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alejo
 * Class Controller.
 */
public class MovieController implements ActionListener{
    
    //Atributtes 
    private ViewMain formMovie;
    private MovieModel MovieM; 
    private QuerysMovie QMovie;
    DefaultTableModel modelTable = new DefaultTableModel();
    
    //Constructor
    public MovieController(ViewMain formMovie,MovieModel MovieM, QuerysMovie QMovie){
        this.formMovie = formMovie; 
        this.MovieM    = MovieM;
        this.QMovie    = QMovie;     
        this.formMovie.jB_add.addActionListener(this);
        this.formMovie.jB_read.addActionListener(this);
        this.formMovie.jB_update.addActionListener(this);
        this.formMovie.jB_delete.addActionListener(this);
        this.formMovie.jB_clear.addActionListener(this);
        this.formMovie.jB_show.addActionListener(this);
        
        initComponents();
    }
    //Init Components.
    public void initComponents() {
        formMovie.setVisible(true);
        formMovie.setResizable(false);
        formMovie.setLocation(400, 250);
        
    }
  
    
    /**
     * This method implements the interface called actionPerformed, execute when the
     * user inicializes the botton ,
     * get to data de ViewMain and set the attributtes of the class MovieModel
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        /**
         * if the event executed is equals to jB_add,create a new object 
         * of type MovieModel getting the datas of formMovie.
         * if the method QMovie.create retun true, it will show a show message 
         * of succes,if this false show message of error. 
         */
        if(ae.getSource() == formMovie.jB_add){
            validationCreate(); 
            while(validationCreate()){
                MovieM.setTitle(formMovie.TF_title.getText());
                MovieM.setYear(Integer.parseInt(formMovie.TF_year_movie.getText()));
                MovieM.setDirector(formMovie.TF_director_movie.getText());
                MovieM.setAbstract_movie(formMovie.JT_resumen.getText());
            
                if(QMovie.create(MovieM)){
                    JOptionPane.showMessageDialog(null,"Agregado Exitosamente!");
                }else{
                    JOptionPane.showMessageDialog(null, "Error");
                }
                break;
            }
        }
        /**
         * if the event executed is equals to jB_read,gets the value of 
         * formMovie.TF_title and set MovieM.setTitle.
         * this call to method read of the class QuerysMovie, if this method 
         * return true it will show a message of success. if return false it 
         * will show message of error. 
         */
        if(ae.getSource() == formMovie.jB_read){
            MovieM.setTitle(formMovie.TF_title.getText());
            
                if (QMovie.read(MovieM)){
                    
                    formMovie.TF_title.setText(String.valueOf(MovieM.getTitle()));
                    formMovie.TF_year_movie.setText(String.valueOf(MovieM.getYear()));
                    formMovie.JT_resumen.setText(String.valueOf(MovieM.getAbstract_movie()));
                    formMovie.TF_director_movie.setText(String.valueOf(MovieM.getDirector()));
                    JOptionPane.showMessageDialog(null, "Listado Exitosamente");
                 
                }else{
                    JOptionPane.showMessageDialog(null,"Error");
   
                }
        }
        /**
         * if the event executed is equals to jB_update, sets  alls the datas 
         * of formMovie.TField and sets on MovieM,this call to method update of 
         * class QuerysMovie,if this methos return true, it will show a message
         * of success, if return false it will show message of error.
         */
        if (ae.getSource() == formMovie.jB_update){
            
            
            
            MovieM.setTitle(formMovie.TF_title.getText());
            MovieM.setYear(Integer.parseInt(formMovie.TF_year_movie.getText()));
            MovieM.setDirector(formMovie.TF_director_movie.getText());
            MovieM.setAbstract_movie(formMovie.JT_resumen.getText());
            
            if(QMovie.update(MovieM)){
                JOptionPane.showMessageDialog(null, "Registro Actualizado Exitosamente");
            }else{
                JOptionPane.showMessageDialog(null, "Falla al actualizar el registro.");
            }
            
        }
        /**
         * if the event executed is equals to jB_delete, gets the value of 
         * formMovie.Jf_title and sets MovieM, then it call the method delete
         * of the class QuerysMovie, if this is true it will show a message of
         * success, if is false it will show a message of error.
         */
        if(ae.getSource() == formMovie.jB_delete){
            MovieM.setTitle(formMovie.TF_title.getText());
            if(QMovie.delete(MovieM)){
                JOptionPane.showMessageDialog(null,"eliminado exitosamente.");
                clean();
            }else{
                JOptionPane.showMessageDialog(null,"error.");
            }
            
        }
        /**
         * if the event executed is equals to jB_show, this will call to method
         * readALL().
         */
        if(ae.getSource() == formMovie.jB_show){
            readAll(formMovie.TableMovies);
            
        }
        
        
        //if the event executed is equals to jB_clear, call to method clean().
        if (ae.getSource() == formMovie.jB_clear ){
            clean();
        }     
    }
    /**
     * @param JTable
     * gets the datas of the method readAll of the class QuerysMovie in a 
     * list Movie of type MovieModel.Create a new array of type object for save each
     * value of the objects saved on the list Movie.
     * Generating a row for cada item of the list Movie and adding to JTABLE. 
     */
    public void readAll(JTable table){
        modelTable =(DefaultTableModel) table.getModel();
        java.util.List<MovieModel> Movie = (java.util.List<MovieModel>) QMovie.readAll();
        Object[] object = new Object[4];
        for(int i = 0; i<Movie.size();i++){
            
            object[0] = Movie.get(i).getTitle();
            object[3] = Movie.get(i).getAbstract_movie();
            object[2] = Movie.get(i).getYear();
            object[1] = Movie.get(i).getDirector();
 
            modelTable.addRow(object);
        }
        formMovie.TableMovies.setModel(modelTable);
    }
    
    /**
     * this method clean all the camps of type TextField and TextFielArea of 
     * the class ViewMain.
     */
    public void clean(){
        formMovie.TF_title.setText(null);
        formMovie.TF_year_movie.setText(null);
        formMovie.TF_director_movie.setText(null);
        formMovie.JT_resumen.setText(null);
    }
    /**
     * this method valid the textfield of main form.
     * @return true,if all textfields they are valid or false if they are invalid.
     * 
     */
    public boolean validationCreate(){
        int flag = 0;
        boolean falgB = false;
        
            if(formMovie.TF_title.getText().length() == 0 || formMovie.TF_director_movie.getText().length() == 0){
                JOptionPane.showMessageDialog(null,"Ingrese un valor valido.");
            }else if(formMovie.TF_year_movie.getText().length() > 4 ||formMovie.TF_year_movie.getText().length() < 4 ) {
                JOptionPane.showMessageDialog(null,"Ingrese un valor valido.");
            }else{
                flag += 2;
            }
               
            if(flag == 2)falgB = true;
   
       return falgB;
    }
}
