class Address
{
    String cityname;
    String areaname;
}
class Student
{
    int rollno;
    String name;
    Address addr; //using Address class variable in Student class
}
public class Has_A
{
    public static void main(String args[])
    {
        Address a=new Address();
        a.cityname="pune";
        a.areaname="karve nagar";

        Student s=new Student();
        s.rollno=3;
        s.name="Riya";
        s.addr=a;

        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.addr.cityname);
        System.out.println(s.addr.areaname);
    }
}