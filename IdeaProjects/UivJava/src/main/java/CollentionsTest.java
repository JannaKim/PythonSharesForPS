import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollentionsTest
{
    private static Collections Collentions;

    public static void main(String[] args)
    {
        String[] animals = {"독수리", "고양이", "강아지"};
        List<String> list = Collentions.nCopies(2,"개미") ;
        System.out.println(list);

        List<String> all = new ArrayList<>(list);
        System.out.println("nCopies : " + all);

        Collentions.fill(all, "별");
        System.out.println(" '별'을 채운후 :  " + all);

        all.addAll(Arrays.asList(animals));
        System.out.println("List를 모두 추가한 후 " + all);

        Collentions.shuffle(all);
        System.out.println("List를 섞은 후 : " + all);

        Collentions.reverse(all);
        System.out.println("List를 역순으로 정렬한 후 : " + all);

        System.out.println("List에서 최소 : " + Collentions.min(all));
        System.out.println("List에서 최대 : " + Collentions.max(all));
        System.out.println("List에서 '별'의 빈도 : " + Collentions.frequency(all, "별"));


    }
}
