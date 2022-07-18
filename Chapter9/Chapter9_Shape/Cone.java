
public class Cone extends Cylinder
{
    private static final double PI = Math.PI;
    public Cone(){
        super(0,0);
    }
    public Cone(double radius,double height){
        super(radius,height);
    }
     @Override
    public double getSurfaceArea(){
        return PI*getR()*(getR()+Math.sqrt(getH()*getH()+getR()*getR()));
    }
     @Override
    public double getVolumn(){
        return PI*getR()*getR()*getH()/3;
    }
    public String getName(){
        return "Cone";
    } 
}
