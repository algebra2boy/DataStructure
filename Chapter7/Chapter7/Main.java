import java.util.*;
class Main {
    public static void main(String[] args) {
        final int NUM_PAIRS = 4;
        int board[] = new int[NUM_PAIRS*2+1];  // ignore the ZERO element spot
        boolean printElement[] = new boolean[NUM_PAIRS*2+1];  // defaulted all to 'false'
        Scanner console = new Scanner(System.in);
        String name1 ="Tom",name2="Mary";
        int score1 = 0,score2 = 0;

        board=fill_shuffle(board,NUM_PAIRS);
        player_interact(board,printElement,name1,name2,score1,score2,console);

    }
    // fill board will fill with [1,1,2,2,3,3,4,4]
    public static int[] fill_shuffle(int board[],int NUM_PAIRS){
        int temp, position1, position2;
        int k=1;
        for (int i=1; i<=NUM_PAIRS*2; i+=2)
        {
            board[i] = k;
            board[i+1] = k; 
            k++;
        }

        // shuffle the board 1000 times
        for (int i=1; i<=1000; i++)
        {   // pick 2 random positions to swap
            position1 = (int) (Math.random() * (board.length-1) + 1);
            position2 = (int) (Math.random() * (board.length-1) + 1);   

            temp = board[position1];
            board[position1] = board[position2];
            board[position2] = temp;
        }
        return board;
    }

    public static void player_interact(int[] board,boolean printElement[],String name1,String name2,int score1,int score2,Scanner console){
        int times = 1;String time;
        int first_guess=0,second_guess=0;

        System.out.println("    Player1: "+name1+"\tScore:"+score1);
        System.out.println("    Player2: "+name2+"\tScore:"+score2);
        System.out.println();

        for(int i=1;i<board.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //to check user's input in the board, if the input in that particular position
        for(int i=1;i<board.length;i++){
            if(printElement[i]==true){
                System.out.print(board[i]+" ");
            }else{
                System.out.print("* ");
            }
        }
        System.out.println();

        if(times==1){
            time="1st";
        }else{
            time="2nd";
        }
        System.out.print(name1+",what is your "+time+" choices:");
        int get_user = console.nextInt();

        if(times==1){
            first_guess = get_user;
        }else{
            second_guess = get_user;
        }
        times++;

        //if(board[first_guess]==board[second_guess]){

        //}

    }
}