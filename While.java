//program to print table
import java.util.*;
public class While
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Table of "+n);
        int i=1;
        while(i<=10)
        {
            System.out.println(i+" * "+n+" = "+(n*i));
            i++;
        }
    }
}