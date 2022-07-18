
public class sphere extends Shape_3D
{
    private double radius;
    private static final double PI = Math.PI;
    public sphere(){
        this(0);
    }
    public sphere(double radius){
        this.radius = radius;
    }
     @Override
    public double getSurfaceArea(){
        return 4*PI*radius;
    }
     @Override
    public double getVolumn(){
        return (4.0/3)*PI*(radius*radius*radius);
    }
    public String getName(){
        return "sphere";
    }
}
