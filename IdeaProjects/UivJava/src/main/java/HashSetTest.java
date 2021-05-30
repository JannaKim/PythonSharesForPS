import javax.print.attribute.HashDocAttributeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode()
    {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Person)
        {
            Person p = (Person) obj;
            return p.name.contentEquals(name) && (p.age == age);
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString()
    {
        return "Person [" + name + ", " + age + "]";

    }
}
public class HashSetTest
{
    public static void main(String[] args)
    {
        Set<Person> set = new HashSet<>();
        set.add(new Person("김열공", 20));
        set.add(new Person("최고봉", 56));
        set.add(new Person("우등생", 16));
        set.add(new Person("나자바", 35));

        set.forEach(s -> System.out.println(s.name + " : " + s.age));

        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next() + " ");

        }
    }
}

