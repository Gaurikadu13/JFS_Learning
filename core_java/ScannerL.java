import java.util.*;
public class ScannerL
{
    String name;
    int rollno;
    String email;
    int mob;

    public void detail()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        name=sc.nextLine();
        System.out.println("Enter your Rollno"); 
        rollno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Your Email");
        email=sc.nextLine();
        System.out.println("Enter Your Mobile no");
        mob=sc.nextInt();
    }
    public void printDetail()
    {
        System.out.println("---Details---");
        System.out.println("Name : "+name);
        System.out.println("Rollno : "+rollno);
        System.out.println("Email : "+email);
        System.out.println("Mobile no : "+mob);
    }

    public static void main(String args[])
    {
        ScannerL s=new ScannerL();
        s.detail();
        s.printDetail();
    }

}