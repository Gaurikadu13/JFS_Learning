public class Operator
{
    public static void main(String args[])
    {
        System.out.println("--Oerators--");
        int a=2,b=6;

        //Arithematic Operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Relational Operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a<b);
        System.out.println(a>b);

        //Logical Operators
        if(a<b && b>0) {
        System.out.println("&&");
        }

        if(a>b || b>0) {
        System.out.println("||");
        }

        if(!(a > b)) {
        System.out.println("Condition is false");
    }
        //Assignment Operators
        int x=3;
        System.out.println("x+=3 -- "+(x+=3));
        System.out.println("x-=5 -- "+(x-=5));
        System.out.println("x*=4 -- "+(x*=4));
        System.out.println("x/=2 -- "+(x/=2));

        //Increment/Decrement
        int y=2;
        System.out.println("y++ "+(y++));
        System.out.println("y-- "+(y--));

        //Conditional Operator
        int p=4,q=5;
        String z=a>b?"True":"False";
    }
}