package packageFour;

import packageSix.*;

public class TestSix
{
    public static void main(String[] args)
    {
        System.out.println("6장 1번");
        Circle circle = new Circle(5);
        circle.show();
        ColoredCircle coloredCircle = new ColoredCircle(10, "빨간색");
        coloredCircle.show();

        System.out.println("6장 2번");
        Person[] p = new Person[3];
        p[0] = new Person("길동이", 22);
        p[1] = new Student("황진이", 23, 100);
        p[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");

        for (Person i : p)
        {
            i.show();
        }

        System.out.println("6장 3번");
        Point p1 = new Point(10, 20);
        MovablePoint mp = new MovablePoint(30, 40, 100, 200);
        System.out.println(p1.toString());
        System.out.println(mp.toString());

        System.out.println("6장 5번");
        Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일 "), new Smartphone("민국이", "갤러그")};

        for (Phone phone : phones)
        {
            if (phone instanceof Smartphone)
            {
                ((Smartphone) phone).playGame();
            } else if (phone instanceof Telephone)
            {
                ((Telephone) phone).autoAnswering();
            } else if (phone instanceof Phone)
            {
                phone.talk();
            }
        }
    }
}
