import java.util.*;
public class If_else{
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Name :- ");
            String name=sc.nextLine();
            System.out.println("Enter your age :- ");
            int age=sc.nextInt();

            if(age>18)
             {
                System.out.println(name+" are elligible for voting ");
             }
             else
             {
                System.out.println(name+" are not elligible for voting ");
             }
    }
}