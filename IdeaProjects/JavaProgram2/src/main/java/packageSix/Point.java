package packageSix;

public class Point
{
    private int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public String toString()
    {
        String str = "좌표 : [ " + this.x + "," + this.y + "]";
        return str;
    }
}