public class P_Point
{
    public int myX;
    public int myY;
    
    public void translate(int dx,int dy){
        myX+=dx;
        myY+=dy;
    }
    public double distanceFromOrigin(){
        return Math.sqrt(myX*myX+myY*myY);
    }
    public String toString(){
        return "("+myX+","+myY+")";
    }
    public P_Point(){
        this(0,0);
    }
    public P_Point(int x,int y){
        this.myX = x;
        this.myY = y;
    }
}
