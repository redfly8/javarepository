public class zeichnen {
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

        board [0][0] = 'X';
        board [0][1] = 'X';
        board [0][2] = 'X';
        board [0][3] = 'X';
        board [0][4] = 'X';

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }




    }
    
}
