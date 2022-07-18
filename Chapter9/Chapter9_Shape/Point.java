
public class Point
{
    private int x,y;
    public Point(){
        this(0,0);
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public Point(Point that){
        this.x = that.getX();
        this.y = that.getY();
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
}
