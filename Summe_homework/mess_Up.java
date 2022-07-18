import java.util.*;
public class mess_Up
{
    public static void main()
    {
        Scanner console = new Scanner(System.in);
        boolean run = true;
        char startDay;
        int hour,minutes,talking;
        double cost = 0;
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

            /*cost =*/ getCost(startDay,hour,minutes,talking);
            System.out.println("\nTotal cost:$"+cost+"\n\n");

            System.out.print("Enter another(y/n)?");
            answer = console.next();
            if(answer.equals("n")){
                run = false;
            }
        }
    }

    public static void getCost(char startDay,int hour,int minutes,int talking)
    {
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
        int cycle = 1;
        double cost = 0.0;
        for(int i=convertMinutes;i<EndTime;i++){
            if(i==1440*cycle){
                count ++;
                count = count%7;
                cycle++;
            }
            if(i==10080){
                i = 0;
                EndTime = EndTime - 10080;
                cycle = 1;
            }
            if(((i>=1440*cycle-960)&&(i<1440*cycle-360))&&(count>=1&&count<=5)){
                cost = cost +0.4;
            }
            if(((i>=1440*cycle-360)||(i<1440*cycle-960))&&(count>=1&&count<=5)){
                cost = cost +0.25;
            }
            if(count==6||count==0){
                cost = cost +0.15;
            }          
        }
        System.out.println("Grand cost:"+cost);
        //return cost;
    }
}