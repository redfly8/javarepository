import java.util.Scanner;
import java.util.function.Function;

public class test {
    
     
    public static void main(String[] args){
      
        

        

        
        
        char [][] board = new char[5][5];

        board [0][0] = 'X';
        board [0][1] = 'X';
        board [0][2] = 'X';
        board [0][3] = 'X';
        board [0][4] = 'X';

        board [1][0] = ' ';
        board [1][1] = ' ';
        board [1][2] = ' ';
        board [1][3] = 'X';
        board [1][4] = ' ';

        board [2][0] = ' ';
        board [2][1] = ' ';
        board [2][2] = 'X';
        board [2][3] = ' ';
        board [2][4] = ' ';

        board [3][0] = ' ';
        board [3][1] = 'X';
        board [3][2] = ' ';
        board [3][3] = ' ';
        board [3][4] = ' ';

        board [4][0] = 'X';
        board [4][1] = 'X';
        board [4][2] = 'X';
        board [4][3] = 'X';
        board [4][4] = 'X';

        char [][] boardA = new char [5][5];

        boardA [0][0] = ' ';
        boardA [0][1] = ' ';
        boardA [0][2] = 'X';
        boardA [0][3] = ' ';
        boardA [0][4] = ' ';

        boardA [1][0] = ' ';
        boardA [1][1] = 'X';
        boardA [1][2] = ' ';
        boardA [1][3] = 'X';
        boardA [1][4] = ' ';

        boardA [2][0] = 'X';
        boardA [2][1] = 'X';
        boardA [2][2] = 'X';
        boardA [2][3] = 'X';
        boardA [2][4] = 'X';

        boardA [3][0] = 'X';
        boardA [3][1] = ' ';
        boardA [3][2] = ' ';
        boardA [3][3] = ' ';
        boardA [3][4] = 'X';

        boardA [4][0] = 'X';
        boardA [4][1] = ' ';
        boardA [4][2] = ' ';
        boardA [4][3] = ' ';
        boardA [4][4] = 'X';



        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(boardA[i][j]);
            }
            System.out.println("");
        }




    }
    
}
