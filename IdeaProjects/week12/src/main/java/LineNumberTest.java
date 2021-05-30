import java.io.*;
import java.util.*;

public class LineNumberTest
{
    public static void main(String[] args)
    {
        String fileName;
        System.out.print("자바 소스 파일이름을 입력하시오 : ");
        fileName = new Scanner(System.in).nextLine();

        try
        {
            int lineNumber = 1;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while(true)
            {
                line = br.readLine();
                if (line == null)
                {
                    break;
                }
                System.out.printf("%3d : %s\n", lineNumber++, line);
                br.close();
            }
        }
        catch (IOException e){}

    }
}
