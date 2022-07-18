import java.util.*;
public class Master_Mind
{
    public static void main(){
        Scanner console = new Scanner(System.in);
        char[] color = new char[4];//defaults to false
        color =shuffle_color(color);
        char[] store = new char[4];//defaults to false
        char[] guessArray = new char[4];//defaults to false
        int life = 0;

        for(int i=0;i<4;i++){
            store[i]=color[i];
        }
        
        System.out.println("You have 10 lives\ninput 4 colors and guess the right color you can choose");
        System.out.println("There are 6 colors\nK=black B=blue Y=yellow\nW=white R=red G=Green\n");
        
        while((!Arrays.equals(color,guessArray))&&(life!=10)){
            // to filled the colorArray everytime 
            for(int i=0;i<4;i++){
                color[i]=store[i];
            }
            System.out.print((life+1)+")");
            System.out.print("Guess Array: ");
            String guess = console.next();

            for(int i=0;i<4;i++){
                guessArray[i]=guess.charAt(i);
            }

            char[] XOArray = new char[4];
            int pos = 0;
            //condition:to find the X's if they are the same color and same position
            for(int i=0;i<4;i++){
                if(guessArray[i]==color[i]){
                    XOArray[pos]='X';
                    pos++;
                    guessArray[i]=' ';//once they met the condition, they will fill up with ' ' 
                    color[i]=' ';
                }
            }
            
            boolean[] repetition = new boolean[4];//defaults to false this is for colorArray           
            boolean[] check  = new boolean[4];//defaults to false this is for guessArray
            
            /* I go through every color in colorArray  
             * find matches in guessArray by going throught every color in guessArray*/
            for(int i=0;i<4;i++){// i here is every color of colorArray
                for(int j=0;j<4;j++){   //j here is every color of guessArray           
                    if(repetition[i]==false){
                        if(guessArray[i]==color[j]&&guessArray[j]!=' '&&color[j]!=' '&&check[j]==false){
                            XOArray[pos]='O';
                            pos++;              
                            check[j]=true;// once I found they are matched, I set them both true prevent recount the color again
                            repetition[i]=true;
                        }
                    }
                }
            }

            System.out.print("XOArray:"+Arrays.toString(XOArray)+"\n");
            System.out.println("---------------------------");
            life++;
        }

        if(Arrays.equals(color,guessArray)){
            System.out.println("Congratulations!!It took "+life+" trys.");
        }else{
            System.out.println("Sorry, you didn't get it right,please try");
            System.out.println("The correct color is:"+Arrays.toString(store));
        }    
        
        System.out.print("Do you want to play again?(Y/N)");
        char answer = console.next().charAt(0);
        
        if(answer=='Y'){
            main();
        }else{
            System.out.println("\nThx and have a great day!");
        }
    }
    
    public static char[] shuffle_color(char[] color)
    {
        int r;char colors;
        for(int i=0;i<4;i++){
            r = (int) (Math.random()*6);//0-5
            if(r==0){
                colors = 'B';
            }else if(r==1){
                colors = 'Y';
            }else if(r==2){
                colors = 'G';
            }else if(r==3){
                colors = 'W';
            }else if(r==4){
                colors = 'K';//black
            }else{
                colors = 'R';
            }
            color[i]=colors;
        }
        return color;
    }
}