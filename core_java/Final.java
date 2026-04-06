public class Final
{
   int x;
   public static void main(String args[])
   {
    final Final f=new Final();
    f.x=100;
    Final f1=new Final();
    f1.x=200;

    System.out.println(f.x);
    System.out.println(f1.x);

    // f=f1;  //error

    System.out.println(f.x);
    System.out.println(f1.x);
   }
}