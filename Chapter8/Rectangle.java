public class Rectangle
{
    int x, y, width, height;
    public Rectangle(int x, int y, int width, int height){
        if(width<0||height<0){
            throw new IllegalArgumentException("Width or height is illgeal");
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Point P,int width,int height){
        this(P.getx(),P.gety(),width,height);
    }
    ///Accessor method
    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public boolean contains(int x, int y){
        return ((x>=this.x)&&(x<=(this.x+this.width)))&&((y>=(this.y-this.height))&&y<=this.y);
    }

    public boolean contains(Point P){
        return ((P.getx()>=this.x)&&(P.getx()<=(this.x+this.width)))&&((P.gety()>=(this.y-this.height))&&P.gety()<=this.y);
    }

    public String toString(){
        return "Rectangle[x="+x+",y="+y+",width="+width+",height="+height+"]";
    }

    public Rectangle union(Rectangle other){
        int x = Math.min(this.x,other.x);
        int y = Math.max(this.y,other.y);
        int width = other.x+other.width-x;
        int height = y-this.y+this.height;
        Rectangle a = new Rectangle(x,y,Math.abs(width),Math.abs(height));
        return a;
    }
    
    
}
