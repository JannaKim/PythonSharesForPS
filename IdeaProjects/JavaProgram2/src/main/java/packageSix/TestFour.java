package packageSix;

import packageFour.*;

public class TestFour
{
    public static void main(String[] args)
    {
        System.out.println("===============================================");
        System.out.println("4장 1번");
        System.out.println("-----------------------------------------------");
        Triangle t1 = new Triangle();
        t1.setBase(10f);
        t1.setHeight(5f);
        System.out.println("삼각형의 넓이는 : " + t1.findArea());
        System.out.println("===============================================");
        System.out.println("4장 3번");
        System.out.println("-----------------------------------------------");

        Member member = new Member("홍길동", "hong",12,"1234!");


        System.out.println("===============================================");
        System.out.println("4장 4번");
        System.out.println("-----------------------------------------------");

        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차의 수: %d, 빨간색 자동차의 수 : %d%n", Car.getNumOfCar(), Car.getNumOfRedCar());

        System.out.println("===============================================");
        System.out.println("4장 6번");
        System.out.println("-----------------------------------------------");
        Complex complex1 = new Complex(2.0);
        System.out.println(complex1.print());
        Complex complex2 = new Complex(1.5, 2.5);
        System.out.println(complex2.print());

        System.out.println("===============================================");
        System.out.println("4장 7번");
        System.out.println("-----------------------------------------------");
        GolfClub g1 = new GolfClub();
        g1.print();
        GolfClub g2 = new GolfClub(8);
        g2.print();
        GolfClub g3 = new GolfClub("퍼터");
        g3.print();

        System.out.println("===============================================");
        System.out.println("4장 8번");
        System.out.println("-----------------------------------------------");
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
