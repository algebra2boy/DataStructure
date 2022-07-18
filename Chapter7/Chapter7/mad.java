import java.util.*;
public class mad{
    public static void main(){
        char[][] problem10 = new char[2][6];
        smoke(problem10);
    }

    public static void smoke(char[][] a){
        int number_of_smoke = 6,number_of_nonsmoke =5;
        int smoke_pos = 0,nonsmoke_pos = 2;
        int row_smoke = 0,row_nonsmoke=0;
        while((number_of_smoke>0)||(number_of_nonsmoke>0)){
            Scanner console = new Scanner(System.in);
            System.out.print("Tell me are you a smoker or nonsmoker(s/n)");
            char input = console.next().charAt(0);

            if(number_of_smoke==0&&input=='s'){
                System.out.println("Sorry,no more seat for smoker");
            }
            if(number_of_nonsmoke==0&&input=='n'){
                System.out.println("Sorry,no more seat for nonsmoker");
            }

            if(input=='s'&&number_of_smoke>0){
                if(smoke_pos==2){
                    row_smoke++;
                    smoke_pos=0;
                    number_of_smoke =2;
                }
                a[row_smoke][smoke_pos] = 's';
                smoke_pos++;
                number_of_smoke--;
                
            }else if(input=='n'&&number_of_nonsmoke>0){
                if(nonsmoke_pos==a[0].length){
                    row_nonsmoke++;
                    nonsmoke_pos=2;
                    number_of_nonsmoke =4;
                }
                a[row_nonsmoke][nonsmoke_pos] = 'n';
                nonsmoke_pos++;
                number_of_nonsmoke--;
            }
            System.out.println(Arrays.deepToString(a)+"\n");
        }
    }
}