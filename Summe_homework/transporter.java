import java.util.*;
public class transporter {
    public static void main()
    {
        printResult();
    }

    public static void printResult(){
        Scanner console = new Scanner(System.in);
        int startRegion,destinationRegion,startTime,tripCount=0;
        char timeZone;double cost;
        boolean enoughMoney,runTheProgram = true;
        String answerYesOrNo = "";

        System.out.print("How much cash do you have for today? ");
        double myBank = console.nextDouble();
        while(runTheProgram == true){
            System.out.println("(1) Atlantic\n(2) Eastern\n(3) Central\n(4) Moutain\n(5) Pacific");
            startRegion = getStartRegion(console);
            destinationRegion = getDestinationRegion(console);
            startTime = getStartTime(console);
            timeZone = getTimeZone(console);
            System.out.println();
            getArrive(startRegion,destinationRegion,startTime,timeZone);
            cost = getCost(startRegion,destinationRegion);
            enoughMoney = enuffInBank(cost,myBank);

            if(enoughMoney==true){
                tripCount++;
                myBank = printOutPut(cost,myBank,tripCount);
            }else if(enoughMoney==false){
                Insufficient(myBank);
            }

            System.out.print("Do you want to transport another?(y/n)");
            answerYesOrNo = console.next();

            if(answerYesOrNo.equalsIgnoreCase("N")){
                runTheProgram = false;
            }
            System.out.println();
        }
        if(runTheProgram == false){
            System.out.println("Thank you for Traveling today!\nHave a great day!!");
        }
    }    

    public static int getStartRegion(Scanner console)
    {
        System.out.print("What is the starting region? ");
        int startRegion = console.nextInt();
        return startRegion;
    }

    public static int getDestinationRegion(Scanner console)
    {
        System.out.print("What is the destination region? ");
        int destinationRegion = console.nextInt();
        return destinationRegion;
    }

    public static int getStartTime(Scanner console)
    {
        System.out.print("What time do you start? ");
        int timeStart = console.nextInt();
        return timeStart;
    }

    public static char getTimeZone(Scanner console)
    {
        System.out.print("AM or PM? ");
        char timeZone = console.next().charAt(0);
        return timeZone;
    }

    public static double getCost(int startRegion,int destinationRegion)
    {
        double crossed = 0,cost = 0;
        if(destinationRegion>startRegion){
            crossed = 1.0*(destinationRegion-startRegion);
            for(int i=startRegion;i<=destinationRegion;i++){
                if(i==1){
                    cost = cost + 0.75;
                }
                if(i==4){
                    cost = cost + 0.5;
                }
            }
        }else if(destinationRegion<startRegion){
            crossed = 1.0*(startRegion-destinationRegion);
            for(int i=startRegion;i>=destinationRegion;i--){
                if(i==1){
                    cost = cost + 0.75;
                }
                if(i==4){
                    cost = cost + 0.5;
                }
            }
        }
        cost = cost + crossed;
        return cost;
    }

    public static boolean enuffInBank(double cost, double myBank)
    {
        boolean enough = true;
        if(cost>myBank){
            enough = false;
        }else if(cost<myBank){
            enough = true;
        }
        return enough;
    }

    public static void Insufficient(double myBank)
    {
        System.out.println("***Insufficient funds. Bank =$"+myBank+" ***");
        System.out.println("***Transport Denied !!!****");
    }

    public static double printOutPut(double cost, double myBank, int tripCount)
    {
        System.out.println("Cost=$"+cost);
        System.out.println("Trip Count="+tripCount);
        myBank = toGetLeft(cost,myBank);
        System.out.println("Bank=$"+myBank);
        return myBank;
    }

    public static double toGetLeft(double cost, double myBank)
    {
        return myBank-cost;
    }

    public static void getArrive(int Start,int Destination,int startTime,char timeZone){
        String start,end,unit = "",arrive = "";
        start = getRegion(Start);
        end = getRegion(Destination);   
        arrive = getArriveTime(Start,Destination,startTime,timeZone);
        if(timeZone =='A'){
            unit ="AM";
        }else if(timeZone == 'P'){
            unit ="PM";
        }
        System.out.println("From "+start+" to "+end+" starting @"+startTime+unit);
        System.out.println("you will arrive @"+arrive);
    }

    public static String getRegion(int region)
    {
        String printRegion = "";
        if(region==1){
            printRegion= "ATLANTIC";
        }else if(region==2){
            printRegion = "EASTERN";
        }else if(region==3){
            printRegion = "CENTRAL";
        }else if(region==4){
            printRegion= "MOUNTAIN";
        }else if(region==5){
            printRegion = "PACIFIC";
        }
        return printRegion;
    }

    public static String getArriveTime(int Start,int End,int startTime,char timeZone)
    {
        String combination ="";
        String unit="";
        int time_diff = Math.abs(Start-End);
        if(Start>End){ //+
            if((time_diff+startTime)>=12){
                startTime = (time_diff+startTime)-12;
                if(timeZone=='A'){
                    timeZone = 'P';
                }else{
                    timeZone = 'A';
                }
            }else if((time_diff+startTime)<12){
                startTime = (time_diff+startTime);
            }
        }else if(Start<End){ // -
            if((startTime-time_diff)>=0){
                startTime = startTime-time_diff;
            }else if((startTime-time_diff)<0){
                startTime = 12-(time_diff-startTime);
                if(timeZone=='A'){
                    timeZone = 'P';
                }else{
                    timeZone = 'A';
                }
            }
        }
        if(timeZone=='A'){
            unit = "AM";
        }else{
            unit = "PM";
        }
        combination = startTime + ""+unit;
        return combination;
    }
}