import java.util.ArrayList;

public class MyTest
{
    public static void main(String[] args)
    {
        int N = 1;
        MyScheduler ms = new MyScheduler();
        ArrayList<Process> procs = new ArrayList<Process>();
        //Process 객체만 사용가능

        for(int i = 0; i < 100; i++)
        {
            procs.add(new Process(N++, (int) (Math.random() * 20), (int) (Math.random() * 100 + 1)));
            //public Process(int pid, int startTime, int time)
            //pid는 하나씩 증가시키고, startTime과 실행시간은 랜덤으로 받는다는 말.

        }
        boolean t = ms.setProcess(procs);
        ms.nextProcess(0);
        System.out.println(ms.execute(50));
    }
}
