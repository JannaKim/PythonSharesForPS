import java.util.ArrayList;
import java.util.List;

public class ListTest
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("갈매기");
        list.add("나비");
        list.add("다람쥐");
        list.add("라마");

        list.removeIf(s -> s.length() != 2);
        list.forEach(s -> System.out.println(s));
    }
}
