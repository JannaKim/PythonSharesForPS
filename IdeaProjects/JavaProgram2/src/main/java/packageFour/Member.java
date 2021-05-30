package packageFour;

public class Member
{
    private String name;
    private String id;
    private int age;
    private String password;

    public Member(String name, String id, int age, String password)
    {
        this.name = name;
        this.id = id;
        this.age = age;
        this.password = password;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {

        this.password = password;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


}
