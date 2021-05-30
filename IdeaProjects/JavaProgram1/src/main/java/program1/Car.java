package program1;

public class Car
{
    private static int NumOfCar = 0;
    private static int NumOfRedCar = 0;
    private String color;

    public Car(String color)
    {
        this.color = color;
        NumOfCar++;
        if (color.compareToIgnoreCase("red") == 0)
        {
            NumOfRedCar++;
        }
    }

    public static int getNumOfCar()
    {
        return NumOfCar;
    }

    public static int getNumOfRedCar()
    {
        return NumOfRedCar;
    }

}



