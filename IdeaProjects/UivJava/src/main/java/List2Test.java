import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List2Test
{
    public static void main(String[] args)
    {
        List<Integer> scores = new ArrayList<>();
        int best = 0;
        char grade;
        int score;

        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하시오 : ");
        while ((score = sc.nextInt()) > 0)
        {
            if (score < 0)
            {
                break;
            }
            scores.add(new Integer(score));
            if (score > best)
            {
                best = score;
            }
            System.out.println("점수를 입력하시오 : ");
        }
        System.out.println("전체학생은 " + scores.size() + "명이다");
        System.out.println("학생들의 성적");
        scores.forEach(x -> System.out.print(x + " "));
        System.out.println();

        for(int i = 0; i< scores.size(); i++)
        {
            score = scores.get(i).intValue();
            if (score >= best - 10)
            {
                grade = 'A';
            }
            else if (score > best - 20)
            {
                grade = 'B';
            }
            else if (score > best - 30)
            {
                grade = 'C';
            }
            else if (score > best - 40)
            {
                grade = 'D';
            }
            else
            {
                grade = 'F';
            }
            System.out.println((i + 1) + "번학생의 성적은 " + score + "점이며 등급은 " + grade + "이다");

        }
    }
}
