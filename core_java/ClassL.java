public class ClassL
{
    
       
    public void display(int rollno,String name)
    {
        System.out.println("Roll no : "+rollno);
        System.out.println("Name : "+name);
    }
public static void main(String args[])
    {
    ClassL c=new ClassL();
    c.display(2,"xyz");

    }
}