
public class waysToclimb
{
    public static void main()
    {
        waysToClimb(3);
        for(int i=1;i<=5;i++){
            writeBinary(i);
        }
    }

    public static void waysToClimb(int n){
        process(n,0,"[");//start at 0 
    }

    private static void process(int destination,int start,String print){
        if(start==destination){//dead end
            System.out.println(print+"]");
        }else if(start<=destination){//not dead end
            process(destination,start+1,print+" 1");//for one step
            process(destination,start+2,print+" 2");//for two step
        }
    }

    public static void writeBinary(int n){
        run(n,0,"[");
    }

    private static void run(int count,int start,String print){
        if(count==start){
            System.out.println(print+"]");
        }else if(start<=count){
            run(count,start+1,print+" 0");
            run(count,start+1,print+" 1");
        }
    }
}
