class A{
    int x;
    public void m1(){
        System.out.println("m1-A");
    }
}
class B extends A
{
    public void m2()
    {
        System.out.println(x);
        m1();
    }
}
public class With_Inheritance
{
    public static void main(String args[])
    {
        B b=new B();
        b.m2();
    }
}