package program1;

public class Triangle
{
    private float base;
    private float height;

    public float getBase()
    {
        return base;
    }

    public void setBase(float base)
    {
        this.base = base;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }

    public float findArea()
    {
        return base * height / 2;
    }
}
