import java.util.*;

public class  Switch_case2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your grade : ");
        char g=sc.next().charAt(0);

        switch(g){

            case 'A': System.out.println("Very good..");
            break;

            case 'B': System.out.println("Good..");
            break;

            case 'C': System.out.println("Average..");
            break;

            case 'D': System.out.println("Bad..");
            break;

            case 'E': System.out.println("Very bad..");
            break;

            default : System.out.println("Input proper grade ");
            break;
        }
    }
}