import java.util.*;
public class Memory
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        final int NUM_PAIRS = 4;
        int board[] =new int[NUM_PAIRS*2+1];  // ignore the ZERO element spot
        boolean printElement[] = new boolean[NUM_PAIRS*2+1];  // defaulted all to 'false'
        boolean[] trueArray = new boolean[NUM_PAIRS*2+1];
        int first,second,position=0;

        board=fill_shuffle(board,NUM_PAIRS);//shuffle
        
        System.out.println(Arrays.toString(board));
        
        System.out.print("How many users:");
        int people = console.nextInt();
        String[] name = new String[people];
        int[] score = new int[people];
        
        // insert every trueArray to true
        for(int i=1;i<trueArray.length;i++){
            trueArray[i]=true;
        }
        //getting people's name 
        for(int i=0;i<name.length;i++){
            System.out.print("player"+(i+1)+"'s Name"+ " is ");
            String person  = console.next();
            name[i]=person;
        }
        System.out.println("\n");

        while(!(Arrays.equals(printElement,trueArray))){
            System.out.println(Arrays.toString(board));
            System.out.println("----------------------------------------");         
            leaderBoard(name,score);
            print(board,trueArray);
            System.out.println();

            //Asking for choices
            System.out.print(name[position]+",what is your #1 choice:");
            first = console.nextInt();            
            System.out.print(name[position]+",what is your #2 choice:");
            second = console.nextInt();
            System.out.println();
           
            if(first==second){//if the user's choices are the same, same position
                System.out.println(name[position]+",You have put the same choice, please try again><<");
            }else if(trueArray[first]==false||trueArray[second]==false){//the position has been exposed
                System.out.println(name[position]+",Error! Position already exposed.Try Again");
            }else{// normal case here
                trueArray[first]=false;
                trueArray[second]=false;
                print(board,trueArray);   
                if(board[first]==board[second]){// the first choice matches the second choice                               
                    if(!(Arrays.equals(printElement,trueArray))){ //when it comes to the last round, it doesn't need to print out this
                        System.out.println("Match,"+name[position]+",Congratulation, you can go again!\n");
                    }
                    score[position]++;
                }else{//the first choice doesn't match the second choice
                    position++;                    
                    if(position==name.length){//if it is the last person playing the game as if it is finished, next round we need to switch back to the first person
                        position = 0;
                    }
                    trueArray[first]=true;
                    trueArray[second]=true;
                    System.out.println("Unfortunately, wrong guess, it is "+name[position]+"'s turn\n");
                }
            }           
        }
        leaderBoard(name,score);
        winner(score,name);
    }
    //printing people's name each round and their score
    public static void leaderBoard(String[] name,int[]score){
        for(int i=0;i<name.length;i++){
            System.out.println("\tPlayer"+(i+1)+":"+name[i]+"\tScore:"+score[i]);
        }
        System.out.println();
    }
    // report the winner here
    public static void winner(int[]score,String[]name){
        int max = score[0],pos = 0,count=0;
        System.out.println("\nWho will be the winner");
        for(int i=1;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
                pos = i;
            }
        }
        for(int i=0;i<score.length;i++){            
            if(max==score[i]){
                System.out.println(name[i]+" has the highest score");
                count++;
            }
        }
        count-=1;
        if(count>0){
            System.out.println("\nThere are "+(count+1)+" player has the same score\nThere is tie between them");           
        }else if(count==0){
            System.out.println(">>>>>>>>Winner is "+name[pos]+"<<<<<<<<<<");
        }
    }  
    // print out the list of the array, to see whether is matched
    public static void print(int[]board,boolean[] trueArray){
        System.out.println("Result:");
        for(int i=1;i<board.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1;i<board.length;i++){
            if(trueArray[i]==false){
                System.out.print(board[i]+" ");
            }else{
                System.out.print("* ");
            }
        }
        System.out.println();
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
}