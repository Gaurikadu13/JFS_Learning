public class ObjectL{
    public void addition(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition : "+c);
    }
    public void multiplication(int x,int y)
    {
        int z=x+y;
        System.out.println("Multiplication : "+z);
    }
    public static void main(String args[])
    {
        ObjectL o=new ObjectL();
        o.addition(5,6);
        o.multiplication(4,3);
    }
}