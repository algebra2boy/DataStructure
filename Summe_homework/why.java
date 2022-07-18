import java.util.*;
public class why
{
    public static void main()
    {
        Scanner console = new Scanner(System.in);
        boolean run = true;
        char startDay;
        int hour,minutes,talking;
        String answer;
        while(run == true){
            System.out.print("Start Day: ");
            startDay = console.next().charAt(0);

            System.out.print("Start Hour: ");
            hour = console.nextInt();

            System.out.print("Start Min: ");
            minutes = console.nextInt();

            System.out.print("Number of minutes talking: ");
            talking = console.nextInt();

            int count = 0;
            if(startDay=='M'){
                count = 1;
            }else if(startDay=='T'){
                count = 2;
            }else if(startDay=='W'){
                count = 3;
            }else if(startDay=='R'){
                count = 4;
            }else if(startDay=='F'){
                count = 5;
            }else if(startDay=='A'){
                count = 6;
            }else if(startDay=='U'){
                count = 0 ;
            }
            int convertMinutes = hour*60+minutes;
            int EndTime = convertMinutes+talking;
            double cost = 0;
            int lol;
            for(int i=convertMinutes;i<EndTime;i++){
                lol = i;
                if(lol>=480&&lol<1080&&(count>=1&&count<=5)){
                    cost = cost +0.4;
                }
                if(lol<480||lol>1080&&(count>=1&&count<=5)){
                    cost = cost +0.25;
                }
                if(count==6||count==0){
                    cost = cost +0.15;
                } 
                if(i%1439==0){
                    count ++;
                    count = count%7;
                    lol = i%1440;
                }
                System.out.println("cost:"+cost);
            
                System.out.println("\nTotal cost:$"+cost+"\n\n");
                System.out.print("Enter another(y/n)?");
                answer = console.next();
                if(answer.equals("n")){
                    run = false;
                }
            }
        }
    }
}