package program1;

public class ColoredCircle
{
    private String color;
    int radius;

    public ColoredCircle(int radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public void show()
    {
        System.out.printf("반지름이 %d인 %s 원이다.%n", radius, color);
    }
}

