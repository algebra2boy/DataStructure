import java.util.*;
public class Tic_Tac_Toe {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char[][] board = new char[3][3];
        boolean check;
        char curr;int row,column;

        introduction();
        board = makeBoard(board);
        printboard(board);

        System.out.print("Are you X or O  ");
        String a = console.next();
        if (a.equalsIgnoreCase("X")) {
            System.out.println("Your oppoent will be O");
        } else if (a.equalsIgnoreCase("O")) {
            System.out.println("Your oppoent will be X");
        }

        System.out.println("\nSystem will choose who will go first");
        int r = (int) Math.floor(Math.random() * 2);
        if (r == 0) {
            System.out.println("X will go first");
            curr = 'X';
        } else {
            System.out.println("O will go first");
            curr = 'O';
        }

        System.out.print("row?!  ");
        row = console.nextInt();
        System.out.print("and column?!  ");
        column = console.nextInt();

        check = checkVaild(board, row, column);
        if (check == false) {
            System.out.println("invaild number for row or column");
        }else {
            move(board, row, column, curr);
        }
        while(!checkALL(board,curr,row,column)){
            curr = switchPlayers(curr);
            System.out.println("\n"+curr+" 's Turn");

            System.out.print("row?!  ");
            row = console.nextInt();
            System.out.print("and column?!  ");
            column = console.nextInt();

            check = checkVaild(board, row, column);
            if (check == false) {
                System.out.println("invaild number for row or column");
            }else {
                move(board, row, column, curr);
            }

            if(checkALL(board,curr,row,column)){
                System.out.println("Winner is "+ curr);
                playAgain(board);
            }
            else if(!draw(board)){
                System.out.println("Draw");
                playAgain(board);
            }           
        }
    }

    public static void playAgain(char[][] board){
        Scanner console = new Scanner(System.in);
        String yes;
        System.out.print("wanna try Again(y/n) ");
        yes = console.next();
        if(yes.equalsIgnoreCase("Y")){
            makeBoard(board);// reset it
            printboard(board);
        }else{
            System.out.println("Thank you for playing");
        }
    }

    public static boolean draw(char[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='-')
                    return true;
            }
        }
        return false;
    }

    public static boolean checkALL(char[][] board,char curr,int row,int column){
        return checkRow(board,curr,row)||
        checkColumn(board,curr,column)||
        checkDiagnoal(board,curr)||checkBackward(board,curr);
    }

    public static boolean checkBackward(char[][] board, char curr){
        int column = board[0].length-1;
        for(int row= 0;row<board.length;row++){
            if(board[row][column]!=curr){
                return false;
            }
            column--;
        }
        return true;
    }

    public static boolean checkDiagnoal(char[][] board,char curr ){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(i==j){// row == column [0][0], [1][1], [2][2] that is call diagnoal
                    if(board[i][j]!=curr){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean checkRow(char[][] board,char curr,int row) {
        for(int j=0;j<board[0].length;j++){
            if(board[row-1][j]!=curr) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumn(char[][] board,char curr,int column){
        for(int j=0;j<board.length;j++){
            if(board[j][column-1]!=curr) {
                return false;
            }
        }
        return true;
    }

    public static char switchPlayers ( char a){
        if (a == 'x' || a == 'X') {
            return 'O';
        }
        return 'X';
    }

    public static boolean checkVaild ( char[][] board, int row, int column){
        return ((row < board.length + 1 && row > 0) && column < board[0].length + 1 && column > 0);
    }

    public static void move( char[][] board, int row, int column, char curr){
        char a = board[row - 1][column - 1];
        if (a != '-') {
            System.out.println("Not vaild position");
        } else {
            board[row - 1][column - 1] = curr;
            printboard(board);
        }
    }

    public static void introduction () {
        System.out.println("Welcome to Tic_tac_toe\nyou know the rule\nTwo players playing X and O");
    }

    public static char[][] makeBoard ( char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }
        return board;
    }

    public static void printboard ( char[][] a){
        System.out.print(" ");
        for(int i=0;i<a[0].length;i++){
             System.out.print(" "+(i + 1));
        }
        System.out.println();
        System.out.print(" -------\n");
        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + "|");
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "|");
            }
            System.out.print("\n ");
            System.out.print("_______\n");
        }
    }
}