public class Final
{
    public void m1(final int r)
    {
        System.out.println(r);
    }
    public void m2(){
        final int x=5;
        System.out.println(x);
        
    }
    public static void main(String args[])
        {
            Final f=new Final();
            f.m1(100);
            f.m2();
        }
}