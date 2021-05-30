package packageSix;

public class ForeignStudent extends Student
{
    private String nationality;

    public ForeignStudent(String name, int age, int studentNumber, String nationality)
    {
        super(name, age, studentNumber);
        this.nationality = nationality;
    }

    public String getNationality()
    {
        return nationality;
    }

    public void show()
    {
        System.out.printf("외국학생[이름 : %s, 나이 :%d, 학번 : %d, 국적 : %s]%n", super.getName(), super.getAge1(), super.getStudentNumber(), nationality);
    }
}

