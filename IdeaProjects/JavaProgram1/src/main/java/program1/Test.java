package program1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("4장 1번");
        System.out.println("-----------------------------------------------");
        Triangle t1 = new Triangle();
        t1.setBase(10f);
        t1.setHeight(5f);
        System.out.println("삼각형의 넓이는 : "+ t1.findArea());

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

        System.out.printf("자동차의 수: %d, 빨간색 자동차의 수 : %d\n", Car.getNumOfCar(), Car.getNumOfRedCar());

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
        GolfClub g3 = new GolfClub("퍼터") ;
        g3.print();

        System.out.println("===============================================");
        System.out.println("4장 8번");
        System.out.println("-----------------------------------------------");
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : "+d.roll());

        System.out.println("===============================================");
        System.out.println("6장 1번");
        System.out.println("-----------------------------------------------");
        Circle circle = new Circle(5);
        circle.show();
        ColoredCircle coloredCircle = new ColoredCircle(10, "빨간색");
        coloredCircle.show();

        System.out.println("===============================================");
        System.out.println("6장 2번");
        System.out.println("-----------------------------------------------");
        Person[] p = new Person[3];
        p[0] = new Person("길동이",22);
        p[1] = new Student("황진이", 23, 100);
        p[2] = new ForeignStudent("Amy",30,200,"U.S.A");

        for (Person i : p) {
            i.show();
        }

        System.out.println("===============================================");
        System.out.println("6장 3번");
        System.out.println("-----------------------------------------------");
        Point p1 = new Point(10, 20);
        MovablePoint mp = new MovablePoint(30, 40, 100, 200);
        System.out.println(p1.toString());
        System.out.println(mp.toString());

        System.out.println("===============================================");
        System.out.println("6장 5번");
        System.out.println("-----------------------------------------------");
        Phone[] phones = {new Phone("황진이"), new Telephone("길동이","내일 "), new Smartphone("민국이", "갤러그")};

        for (Phone phone : phones)
        {
            if(phone instanceof Smartphone)
            {
                ((Smartphone) phone).playGame();
            } else if (phone instanceof Telephone) {
                ((Telephone) phone).autoAnswering();
            } else if (phone instanceof Phone) {
                phone.talk();
            }
        }

        System.out.println("===============================================");
        System.out.println("5장 5번");
        System.out.println("-----------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        int count[] = {0,0,0,0,0,0,0,0,0,0};

        int x = 0;
        for (int i = 0; i < numbers.length; i++) {
            x = sc.nextInt();
            numbers[i] = x;
            if (x<0)
            {
                continue;
            }
            count[numbers[i]/10]++;


        }
        for (int i = 0; i < count.length; i++) {
            System.out.print(i * 10 + "~" + (i * 10+9) + " : ");
            for (int j = 0; j < count[i]; j++ )
                System.out.print("*");
            System.out.println();

        }


    }
}
