public class Static
{
    static int x;
    int y;
    public static void main(String args[])
    {
        Static s=new Static();
        s.x=100;
        s.y=500;

        Static s1=new Static();
        s1.x=700;
        s1.y=800;

        System.out.println(s.x);    //700
        System.out.println(s.y);    //500
        System.out.println(s1.x);   //700
        System.out.println(s1.y);   //800

    }
}