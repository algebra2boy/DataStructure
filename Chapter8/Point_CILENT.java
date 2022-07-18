public class Point_CILENT
{
    public static void main(){
        P_Point p1,p2,p3,p4,p5,p6;
        
        //Self_check16
        p1 = new P_Point();
        p2 = new P_Point();
        p3 = new P_Point(2,1);
        System.out.println("p1 = "+p1);
        System.out.println("p1 x = "+p1.myX);
        System.out.println("p1 y = "+p1.myY+"\n\n");
        
        p1.myX = 8;
        p1.myY = 2;
        p2.myX = 4;
        p2.myY = 3;
        
        System.out.println("p1 = "+p1.toString());
        System.out.println("p2 = "+p2.toString()+"\n\n");
        
        p1.translate(1,2);
        p2.translate(-1,10);
        System.out.println("p1 now  = "+p1.toString());
        System.out.println("p2 now = "+p2.toString());
        
        double distance = p1.distanceFromOrigin();
        System.out.println("distance="+distance);
        System.out.println();
    }
}
