import java.util.*;
public class Back_Up
{
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
        String unit ="";
        int time_diff = Math.abs(Start-End);
        if(Start>End){ //+
            if((time_diff+startTime)>=12){
                startTime = (time_diff+startTime)-12;
                if(timeZone=='A'){
                    timeZone = 'P';
                }else{
                    timeZone = 'A';
                }
            }else if((time_diff+startTime)<=12){
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
        unit = startTime + ""+timeZone;
        return unit;
    }
}