public class Cylinder extends Shape_3D
{
    private double radius,height;
    private static final double PI = Math.PI;
    public Cylinder(){
        this(0,0);
    }
    public Cylinder(double radius,double height){
        this.radius = radius;
        this.height = height;
    }
    public double getR(){
        return radius;
    }
    public double getH(){
        return height;
    }
    
     @Override
    public double getSurfaceArea(){
        return 2*PI*radius*height+2*PI*radius*radius;
    }
     @Override
    public double getVolumn(){
        return PI*(radius*radius)*height;
    }
    public String getName(){
        return "Cylinder";
    }
}
