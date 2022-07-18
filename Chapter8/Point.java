public class Point implements Comparable<Point>
{
    private int x;
    private int y;
    //Constructor
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Accessor method
    public int getQuadrant(/*int x,int y*/){
        if(y>0){
            if(x>0){return 1;}else{return 2;}
        }else if(y<0){
            if(x<0){return 3;}else{return 4;}}
        return 0;
    }

    public double getSlope(Point other){
        if(this.x==other.x){
            throw new IllegalArgumentException("X-coordinate are the same");
        }
        return (double)(other.y-this.y)/(other.x-this.x);
    }

    public boolean isVertical(Point other){
        return other.x == this.x;
    }

    public double ManhattanDistance(Point other){
        return Math.abs(other.x-this.x)+Math.abs(other.y-this.y);
    }

    public boolean isCollinear(Point p1,Point p2) 
    {
        // basic case: all points have same x or y value
        if((this.getx()==p1.getx()&&p1.getx()==p2.getx())||(this.gety()==p1.gety())&&p1.gety()==p2.gety()){
            return true;
        }else{
            // complex case: compare slopes
            double slope1 = this.getSlope(p1);   
            double slope2 = this.getSlope(p2); 

            return (round(slope1, 4) == round(slope2, 4));
        }
    }  

    public static double round(double value, int places) 
    {
        double pow10 = Math.pow(10, places);
        return Math.round(value * pow10) / pow10;
    }

    public String toString(){
        return "("+x+","+y+")";
    }

    public int getx(){
        return this.x;
    }

    public int gety(){
        return this.y;
    }
    //Mutator method
    public void flip(){
        int temp = -this.x;
        this.x= -this.y;
        this.y = temp;
    }   

    public int compareTo(Point other)
    {
        return y-other.y;
    }
}
