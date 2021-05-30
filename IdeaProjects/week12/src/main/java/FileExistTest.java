import java.io.File;

public class FileExistTest
{
    public static void main(String[] args)
    {
        File f = new File("C:\\temp\\file.txt");
        if (f.exists())
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }
}
