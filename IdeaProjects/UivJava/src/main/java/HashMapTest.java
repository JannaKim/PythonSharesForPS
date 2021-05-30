import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;

public class HashMapTest
{
    public static void main(String[] args)
    {
        Map<String, String> map1 = Map.of("호랑이", "tiger", "사자", "lion", "표범", "leopard");
        Map<String, String> map2 = new Hashtable<>(map1);
        System.out.println("변경 전 " + map2);
        map2.replaceAll((k, v) -> v.toUpperCase());
        System.out.println("변경후 : " + map2);
    }
}
