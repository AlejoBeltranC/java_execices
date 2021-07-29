
package oop;

/**
 *
 * @author alejo
 */
public class Triki {
    
    //Atributtes
    private String[][] board = new String[3][3];
    
    public Triki(){
        this.board = board;
    }
    //Ingresa valores al tablero dados por el usuario
    public void marcarCasilla(String simbolo, int fila, int columna){
        board[fila][columna] = simbolo;
    }
    //verifica si hay ganador
    public String verificarGanador(){
        String state = "No hay Ganador" ;
        for(int i = 0; i<board.length; i ++){
            //Verifica de manera lineal
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2] ){
               state = "Ganador: " + board[0][0]; 
            }else if (board[0][i] == board[1][i] && board[0][i] == board[2][i] ){
               state =  "Ganador: " + board[0][0]; 
            }
        }
        //Verifica diagonales. 
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] ){
               state =  "Ganador: " + board[0][0] ; 
            }else if (board[0][2] == board[1][1] && board[0][2] == board[2][0] ){
               state =  "Ganador: " + board[0][2] ; 
            }
        
        return state;
    }
    
    public String verificarCasilla(int x, int y){
        return board[x][y];
    }
    
    
}
