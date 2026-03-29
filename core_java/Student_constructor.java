public class Student_constructor
{
    int rollno;
    String name;
    public Student_constructor(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public static void main(String args[])
    {
        Student_constructor s=new Student_constructor(3,"Vishakha");
        Student_constructor s1=new Student_constructor(4,"Roit");

        System.out.println("Roll no : "+s.rollno+" Name : "+s.name);
        System.out.println("Roll no : "+s1.rollno+" Name : "+s1.name);
    }
}