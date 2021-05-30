package packageSix;

public class Student extends Person
{
    private int studentNumber;

    public Student(String name, int age, int studentNumber)
    {
        super(name, age);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public void show()
    {
        System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]%n", super.getName(), super.getAge1(), studentNumber);
    }
}
