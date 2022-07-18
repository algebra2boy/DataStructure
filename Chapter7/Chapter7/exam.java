
/**
 * Write a description of class exam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class exam
{
    public static void main(){
        char[][] a = {{'X','O','X'},
                     {'O','X','O'} ,
                     {'X','O','X'}};
        System.out.println(draw(a));
    }
    public static boolean draw(char[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='-')
                    return true;
            }
        }
        return false;
    }
}
