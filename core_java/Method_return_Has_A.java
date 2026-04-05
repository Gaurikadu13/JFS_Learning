class Address{
    private String cityname;
    private String areaname;

    public void setCityname(String cityname)
    {
        this.cityname=cityname;
    }
    public String getCityname()
    {
        return cityname;
    }
    public void setAreaname(String areaname)
    {
        this.areaname=areaname;
    }
    public String getAreaname()
    {
        return areaname;
    }
}
class Student{
    private int rollno;
    private String name;
    private Address addr;
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
    public void setAddr(Address addr)
    {
        this.addr=addr;
    }
    public Address getAddr()
    {
        return addr;
    }
    
}
public class Method_return_Has_A
{
    public Student m1()
    {
        Address adr=new Address();
        adr.setCityname("Amravati");
        adr.setAreaname("Gopal nagar");

        Student stu=new Student();
        stu.setRollno(5);
        stu.setName("Rohini");
        stu.setAddr(adr);
        return stu;
    }

   public static void main(String args[])
   {
    Method_return_Has_A m=new Method_return_Has_A();
    Student s=m.m1();
    System.out.println(s.getRollno());
    System.out.println(s.getName());
    System.out.println(s.getAddr().getCityname());
    System.out.println(s.getAddr().getAreaname());
   } 
}