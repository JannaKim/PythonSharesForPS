package packageSix;

public class MovablePoint extends Point
{
    private int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed()
    {
        return xSpeed;
    }

    public int getySpeed()
    {
        return ySpeed;
    }

    public String toString()
    {
        String str = "좌표 : [ " + super.getX() + "," + super.getY() + "]  , " + "이동속도 :" + this.xSpeed + "," + this.ySpeed;
        return str;
    }

}
