import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test
{
    private static Scheduler sched;
    private static int N = 1;
    public static void setSched(Scheduler yours)
    {
        sched = yours;
    }
    public static void solve()
    {
        int time = 0;
        ArrayList<Process> procs = new ArrayList<Process>();
        //Process 객체만 사용가능

        for(int i = 0; i < 100; i++)
        {
            procs.add(new Process(N++, (int) (Math.random() * 20), (int) (Math.random() * 100 + 1)));
            //public Process(int pid, int startTime, int time)
            //pid는 하나씩 증가시키고, startTime과 실행시간은 랜덤으로 받는다는 말.
        }
        boolean t = sched.setProcess(procs);
        if(!t)  return;
        while (!sched.isEmpty())
        {
            Process currentProcess = sched.nextProcess(time);
            if (currentProcess.getPid() == -1)
            {
                time++;
                continue;
            }
            System.out.println("===========================================");
            System.out.println("The current time is " + time + " : ");
            System.out.println(currentProcess);
            System.out.println("is running");
            int executeTime = sched.execute(currentProcess.getPid());
            time += executeTime;
            System.out.println("Until " + time);
            System.out.println("===========================================");
            System.out.println();
        }
    }
}
