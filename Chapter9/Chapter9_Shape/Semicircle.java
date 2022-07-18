public class Semicircle extends Circle {
    public Semicircle(){
        super();
    }
    public Semicircle(double radius,int x, int y){
        super(radius,new Point(x,y));
    }
    public Semicircle(double radius,Point that){
        super(radius,that);
    }

    @Override
    public double getArea() {
        return (super.getArea())/2.0;
    }
    @Override
    public double getPerimeter(){
        return (super.getPerimeter())/2+2*getRadius();
    }
    public String getName(){
        return "Semicircle";
    }
    public int getSideCount()
    {
        return super.getSideCount();
    }
}
