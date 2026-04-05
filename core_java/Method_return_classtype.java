class Student{
    private int rollno;
    private String name;

    public void setRollno(int rollno)
    {
        this.rollno=rollno;
    }
    public int getRollno()
    {
        return rollno;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
}
public class Method_return_classtype
{
    public Student m1()
    {
        Student stu=new Student();
        stu.setRollno(1);
        stu.setName("Sampada");
        return stu;
    }
    public static void main(String args[])
    {
        Method_return_classtype m=new Method_return_classtype();
        Student stu=m.m1();
        System.out.println(stu.getRollno());
        System.out.println(stu.getName());
    }
}