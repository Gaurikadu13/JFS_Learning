import java.util.*;
public class Else_if
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
    
    if(n>0)
        System.out.println(n+" is a  Positive number");

    else if(n<0)
        System.out.println(n+" is a  Negative number");
    else
        System.out.println("Entered number is Zero ");
    }
}