import java.awt.*;
public class ColoredPoint extends Point implements Colored
{
    private Color color;
    public ColoredPoint(int x, int y, Color color)
    {
        super(x,y);
        this.color = color;
    }
    // accessor method
    public Color getColored()
    {
        return color;
    }
}
