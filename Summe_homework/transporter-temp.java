import java.util.*;

public class transporter{
    public static double bank=balance();
    public static int start=0;
    public static String unit2=" ";
    public static int destination=0;

    
    public static int StartTime=0;
    public static String unit="";
    public static int ArriveTime=0;

    public static void main(){ 	 
        PrintResult();
    }

    public static void PrintResult(){
        int count=0;
        Scanner console=new Scanner(System.in);
        int z=0;

        while(z==0){
            String StartRegion=StartRegion();
            String DestinationRegion=DestinationRegion();
            int starttime=StartTime();
            String unit=unit();

            double cost=cost();
            bank=bank-cost;
            count++;
            if( enuffInTheBank()==true){
                System.out.println("From  "+StartRegion+" to "+DestinationRegion+" @ "+StartTime+unit);

                System.out.println(" You will arrive @ "+ArriveTime()+unit2);
                System.out.println("cost="+cost);
                System.out.println("Bank="+bank);
                System.out.println("Trip count="+count);
            }else{
                bank+=cost;
                System.out.println("***Insufficient funds. Bank="+bank+"***");
                System.out.println("Transport Denied!!!***");
            }

       	 
            System.out.println("Do you want to transport another?(y/n)");
            String answer=console.next();
            answer=answer.toUpperCase();
            if(answer.equals("Y")){
                z=0;

            }else{z++;}

        }
        System.out.println("Thank you for traveling today!");
        System.out.println("Have a great day!");
    }

    public static boolean enuffInTheBank(){
        String text="";
        boolean b=true;
        if(b==(bank>0)){
            return b;
        } else{ b=false;
        }

        return b;

    }

    public static double balance(){
        double bank=0;
        Scanner console=new Scanner(System.in);
        System.out.println("How much cash do you have for today?");
        bank=console.nextDouble();
        return bank;

    }

    public static String StartRegion(){
        System.out.println("What' the starting region");
        Scanner console=new Scanner(System.in);
        start=console.nextInt();

        switch(start){
            case 1: String i="Atlantic";

            return i;

            case 2: i="Eastern";
            return i;
            case 3: i="Central";
            return i;
            case 4: i= "Mountain";
            return i;
            case 5: i= "Pacific";
            return i;
            default:

        }
        return null;
    }

    public static String DestinationRegion(){
        System.out.println("What's the destination region");
        Scanner console=new Scanner(System.in);
        destination=console.nextInt();
        switch(destination){
            case 1: String x="Atlantic";

            return x;

            case 2: x="Eastern";

            return x;
            case 3: x="Central";

            return x ;
            case 4: x="Mountain";

            return x;
            case 5: x="Pacific";

            return x;

        }
        return null;
    }

    public static int StartTime(){
        System.out.println("What time do you start");
        Scanner console=new Scanner(System.in);
        StartTime=console.nextInt();
        return StartTime;

    }

    public static String unit(){
        System.out.println("AM or PM");
        Scanner console=new Scanner(System.in);
        unit=console.next();
        unit=unit.toUpperCase();
        switch(unit){
            case "A":  unit="AM";return unit;
            case "P":  unit="PM";return unit;
            default:return null;

        }
    }

    public static int ArriveTime(){
        int Arrivetime=0;
        if(unit.equals("AM")&&StartTime==12){
            StartTime=24;
        } else if(unit.equals("PM")&&StartTime==12){
            StartTime=12;
        } else if(unit.equals("PM")){
            StartTime+=12;
        }
        Arrivetime+=StartTime+(start-destination);
        if(ArriveTime<0){ Arrivetime+=24;  }
        else if(Arrivetime>24){ Arrivetime-=24;}

        if(Arrivetime==0){Arrivetime=12;unit2="AM";}
        else if(Arrivetime>12){ Arrivetime-=12; unit2="PM";}
        else if(Arrivetime==12){unit2="PM";}
        else if(Arrivetime<12){unit2="AM";}

        return Arrivetime;

    }

    public static double cost(){
        double cost=0;
        if(start<destination){
            for(int i=start;i<destination;i++){
                cost+=1;
                if(i==4){
                    cost+=0.5;
                }
                if(i==1){
                    cost+=0.75;
                }
            }
        }
        else if(start>destination){
            for(int i=start;i>destination;i--){
                cost+=1;
                if(i==4){
                    cost+=0.5;
                }
                if(i==1){
                    cost+=0.75;
                }
            }
        } else if(start==destination){
            cost+=0.5;
        }
        return cost;
    }
}



