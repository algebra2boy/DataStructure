import java.util.*;
public class twist{
    public static void main(){
        char[][] problem10 = new char[2][8];
        smoke(problem10);
    }
    public static void smoke(char[][] a){
        int non_row =0,smoke_row=0;
        int number_of_smoke = 6,number_of_nonsmoke =10;
        int smoke_pos = 0,nonsmoke_pos = 3;
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
                a[smoke_row][smoke_pos] = 's';
                smoke_pos++;
                number_of_smoke--;
            }else if(input=='n'&&number_of_nonsmoke>0){
                a[non_row][nonsmoke_pos] = 'n';
                nonsmoke_pos++;
                number_of_nonsmoke--;
            }
            if(nonsmoke_pos==a[non_row].length-1){
                non_row++;
                nonsmoke_pos = 3;
            }
            if(smoke_pos==(a[smoke_row].length-1)-(number_of_nonsmoke/2)){
                smoke_row++;
                smoke_pos = 0;
            }
            System.out.println(Arrays.deepToString(a)+"\n");
        }
    }
}