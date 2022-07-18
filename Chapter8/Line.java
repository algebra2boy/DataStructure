public class Line
{
    public Point p1;
    public Point p2;

    //Constructors
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(){
        this(0,0,0,0);
    }

    public Line(int x1, int y1,int x2,int y2){
        this(new Point(x1,y1),new Point(x2,y2));
    }
    //Accessor method
    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public double getSlope(Point p1,Point p2){
        if(p1.getx()==p2.getx()){
            throw new IllegalArgumentException("the denominator is the same");
        }
        return (double)(p2.gety()-p1.gety())/(p2.getx()-p1.getx());
    }

    public double getSlope()
    {
        return getSlope(this.p1,this.p2);
    }

    public boolean isCollinear(Point p) 
    {
        // basic case: all points have same x or y value
        if((this.p1.getx()==this.p2.getx()&&this.p2.getx()==p.getx())||(this.p1.gety()==this.p2.gety()&&this.p2.gety()==p.gety())){
            return true;
        }else{
            // complex case: compare slopes
            double slope1 = getSlope(p1,p);   
            double slope2 = getSlope(p2,p); 

            return (round(slope1, 4) == round(slope2, 4));
        }
    }   

    public static double round(double value, int places) 
    {
        double pow10 = Math.pow(10, places);
        return Math.round(value * pow10) / pow10;
    }

    public String toString(){
        return "[("+this.p1.getx()+","+this.p1.gety()+"), ("+this.p2.getx()+","+this.p2.gety()+")]";
    }

}
