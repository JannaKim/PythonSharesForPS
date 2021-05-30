import javax.lang.model.type.ArrayType;
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

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
        Process minv = new Process(0,0,111);

        for (int i = 0; i < readyQueue.size(); i++)
        {
            Process t = readyQueue.get(i);
            if (currentTime >= t.getArrivedTime())
            {
                if (t.getTime() < minv.getTime())
                {
                    minv = t;
                }
            }

        }
        if (minv.getPid() == 0)
        {
            return new Process(-1, 0, 0);
        }
        return minv;
    }

    public int execute(int pid)
    {
        for(int i =0; i< readyQueue.size(); i++)
        {
            Process t = readyQueue.get(i);
            if(t.getPid() == pid)
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
