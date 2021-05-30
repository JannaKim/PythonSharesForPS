import java.util.Scanner;

public class s_1978
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numList = new int[n];
        int count = 0;
        boolean ans = true;

        for(int i = 0; i < n; i++)
        {
            numList[i] = sc.nextInt();
        }
        for(int i = 0; i < numList.length; i++)
        {
            if (numList[i] == 1)
            {
                count += 0;
                ans = false;
            }
            else
            {
                ans = true;
                if (numList[i] != 2 && numList[i] % 2 == 0)
                {
                    ans  = false;
                }
                for(int j = 3; j < numList[i]; j = j+2)
                {
                    if (j * j > numList[i])
                    {
                        break;
                    }
                    if (numList[i] % j == 0)
                    {
                        ans  = false;
                        break;
                    }
                }
            }
            if (ans == true)
            {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
