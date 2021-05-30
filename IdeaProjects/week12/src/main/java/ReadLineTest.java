import java.io.*;

public class ReadLineTest
{
    public static void main(String[] args)
    {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        boolean cont = true;
        String line = null;
        while (cont)
        {
            System.out.print("input line : ");
            try
            {
                line = br.readLine();
            }
            catch (Exception e)
            {

            }
            if (line.length() == 0)
            {
                break;
            }
            System.out.println("output : "+line);
        }
    }
}
