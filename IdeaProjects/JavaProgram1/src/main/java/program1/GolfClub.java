package program1;

public class GolfClub
{
    String kind;
    int number;

    public GolfClub(int number)
    {
        this.kind = "아이언";
        this.number = number;
    }

    public GolfClub()
    {
        this.kind = "아이언";
        this.number = 7;
    }

    public GolfClub(String kind)
    {
        this.kind = kind;
        this.number = 0;
    }

    public void print()
    {
        if (number == 0)
        {
            System.out.printf("%s 입니다%n", kind);
        } else
        {
            System.out.printf("%d 번 아이언 입니다%n", number);
        }
    }
}



