public class Constructor
{
    int x;
    public Constructor(int x)
    {
        this.x=x;
    }
        public static void main(String args[])
        {
        Constructor a=new Constructor(100);
        Constructor a1=new Constructor(300);
        System.out.println(a.x);
        System.out.println(a1.x);
        }
    
}

