import java.util.ArrayList;

public class MyScheduler implements Scheduler
{
    private ArrayList<Process> readyQueue;

    public MyScheduler()
    {
        readyQueue = new ArrayList<>();
    }
    public boolean setProcess(ArrayList<Process> prs)
    {
        for(int i = 0; i < prs.size(); i++)
        {
            readyQueue.add(prs.get(i));
        }
        return true;
    }
    public Process nextProcess(int currentTime)
    {
        Process min = new Process(0,0,111);

        for(int i = 0; i < readyQueue.size(); i++)
        {
            Process t = readyQueue.get(i);
            if(currentTime >= t.getArrivedTime())
            {
                if (t.getTime() < min.getTime())
                {
                    min = t;
                }
            }
        }
        if (min.getPid() == 0)
        {
            return new Process(-1, 0, 0);
        }
        return min;
    }
    public int execute(int pid)
    {
        for(int i = 0; i < readyQueue.size(); i++)
        {
            Process t = readyQueue.get(i);
            if (t.getPid() == pid)
            {
                readyQueue.remove(t);
                return t.getTime();
            }
        }
        return 0;

    }
    public boolean isEmpty()
    {
        return readyQueue.size() == 0;
    }
}