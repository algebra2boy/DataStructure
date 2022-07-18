import java.util.*;
public class LongDistance
{
    public static void main()
    {
        Scanner console = new Scanner(System.in);
        boolean run = true;
        char startDay;
        int hour,minutes,talking;
        double cost,grandCost = 0;
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

            cost = getCost(startDay,hour,minutes,talking);
            System.out.printf("\nTotal cost:$%.2f\n\n",cost);
            grandCost+=cost;

            System.out.print("Enter another(y/n)?");
            answer = console.next();
            if(answer.equals("n")){
                run = false;
            }
        }
        if(run == false){
            System.out.println("********************");
            System.out.printf("Grand Total: $%.2f\nThx for playing and have a great day!!!\n",grandCost);
            System.out.println("********************");

        }
    }

    public static double getCost(char startDay,int hour,int minutes,int talking)
    {
        int dayCount = 0,beginningTime,endTime;
        double cost = 0;
        if(startDay=='M'){
            dayCount = 0;
        }else if(startDay=='T'){
            dayCount = 1;
        }else if(startDay=='W'){
            dayCount = 2;
        }else if(startDay=='R'){
            dayCount = 3;
        }else if(startDay=='F'){
            dayCount = 4;
        }else if(startDay=='A'){
            dayCount = 5;
        }else if(startDay=='U'){
            dayCount = 6 ;
        }
        beginningTime = (1440*dayCount)+(hour*60+minutes);
        endTime = beginningTime+talking;
        cost = 0;
        for(int time=beginningTime;time<endTime;time++){
            if(time==1440*dayCount+1440){
                dayCount++;
            }
            if(time==10080){
                time = 0;
                endTime = endTime - 10080;
                dayCount = 0;
            }
            // before 8:am and after 6:00pm
            if(((time<1440*dayCount+480)||(time>=1440*dayCount+1080))&&dayCount<=4){
                cost+=0.25;
            }
            //between 8 am and 6pm
            if(((time<1440*dayCount+1080)&&(time>=1440*dayCount+480))&&dayCount<=4){
                cost+=0.4;
            }
            if(dayCount>4){
                cost+=0.15;
            }
        }
        return cost;
    }
}