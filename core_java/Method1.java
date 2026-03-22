public class Method1{
         
        //Technique 1
        // int a=10;
        // int b=30;
        // int c=a+b;
        // System.out.println("Adddition "+ c);

        // int x=10;
        // int y=30;
        // int z=x*y;
        // System.out.println("Multiplication "+ z);

        //Technique 2
    //     int a;
    //     int b;
    //     int c;
    //     public void adddition(){
    //         c=a+b;
    //         System.out.println("adddition : "+c);
    //     }
    //       public void multiplication(){
    //         c=a*b;
    //         System.out.println("multiplication "+c);
    //     }
    //       public static void main(String args[])
    // {
    //     Method1 m=new Method1();
    //     m.a=3;
    //     m.b=6;
    //     m.adddition();
    //     m.multiplication();

    // }
    int c;
    public void adddition(int a,int b)
    {
    c=a+b;
    System.out.println("Addition is "+c);    
    }
     public void multiplication(int a,int b)
    {
    c=a*b;
    System.out.println("Addition is "+c);    
    }

    public static void main(String args[])
    {
        Method1 a=new Method1();
        a.adddition(3,4);
        a.multiplication(2,3);
    }
    }
