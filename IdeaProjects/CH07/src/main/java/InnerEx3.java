public class InnerEx3
{
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner3
    {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }
    static class StaticInner3
    {
        static int scv = outerCv;
    }
    void myMethod()
    {
        int lv = 0;
        final int Lv = 0;

        class LocalInner3
        {
            int liv = outerIv;
            int liv2 = outerCv;

            int liv3 = lv;
            int liv4 = Lv;
        }
    }
}
