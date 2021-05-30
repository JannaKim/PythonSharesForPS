public class InterfaceTest3
{
    public static void main(String[] args)
    {
        A3 a = new A3();
        a.methodA();
    }
}
class A3
{
    void methodA()
    {
        I1 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}
interface I1
{
    public abstract void methodB();
}

class B3 implements I1
{
    public void methodB()
    {
        System.out.println("methodB in B class");

    }
    public String toString()
    {
        return "Class B";
    }

}
class InstanceManager
{
    public static I1 getInstance()
    {
        return new B3();
    }
}
