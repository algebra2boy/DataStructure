import java.util.*;
public class Hangman_ {
    public static void main() {
        Scanner console = new Scanner(System.in);
        char[] secret = {'m','a','l','d','e','n'};
        char[] OpArray = new char[6];
        char[] guess = new char[26];
        int life = 6,guess_pos = 0;
        boolean death,repetition;
        char getuser;

        System.out.println(Arrays.toString(OpArray));
        while(life!=0 && !(Arrays.equals(secret,OpArray)))
        {
            getuser = getuser(console);
            if(repetition(guess,getuser)==false)
            {
                System.out.println("You already typed this letter");
            }
            death = check(getuser,secret,OpArray,guess,guess_pos);
            guess_pos++;

            System.out.println(Arrays.toString(OpArray));
            life = life(death,life);
            System.out.println("number_of_life:"+life+"\n");
        }
        if(life==0){
            System.out.println("Sorry, the lives is no more");
            main();
        }else if(Arrays.equals(secret,OpArray)){
            System.out.println("Congratulation, you get the right letter");
        }

    }

    public static boolean repetition(char[] guess, char getuser){
        for(int i=0;i<guess.length;i++){
            if(guess[i]==getuser){
                return false;
            }
        }
        return true;
    }

    public static char getuser(Scanner console){
        System.out.print("Tell me your guess just for one letter:");
        char get = console.next().charAt(0);
        return get;
    }

    public static boolean check(char result, char[] secret,char OpArray[],char guess[],int guess_pos){
        int count  = 0;
        for(int i=0;i<secret.length;i++){
            if(result==secret[i]){
                OpArray[i] =result;
                count++;
            }
        }
        guess[guess_pos] = result;
        return(count==0);
    }

    public static int life(boolean number_lives,int life){
        if(number_lives==true){
            life--;
        }
        return life;
    }
}