class Student
{
     int rollno;
     String name;

    public Student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public int getRollno()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
}
public class Method_parameter
{
    public void m(Student s,Student s1)
    {
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s1.rollno);
        System.out.println(s1.name);
    }
    public static void main(String args[])
    {
        Method_parameter t=new Method_parameter();
        Student s=new Student(1,"Snehal");
        Student s1=new Student(2,"Parimal");

        t.m(s,s1);
    }
}