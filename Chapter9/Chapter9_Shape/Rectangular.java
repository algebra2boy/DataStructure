
public class Rectangular extends Shape_3D
{
    private double length,width,height;
    public Rectangular(){
        this(0,0,0);
    }
    public Rectangular(double length,double width,double height ){
        this.length = length;
        this.width  = width;
        this.height = height;
    }
     @Override
    public double getSurfaceArea(){
        return 2*length*width+2*length*height+2*width*height;
    }
     @Override
    public double getVolumn(){
        return length*width*height;
    }
    public double getSide(){
        return length;
    }
    public String getName(){
        return "Rectangular";
    }
}
