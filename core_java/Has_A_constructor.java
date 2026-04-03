class Address
{
    String cityname;
    String areaname;

    public Address(String cityname,String areaname)
    {
        this.cityname=cityname;
        this.areaname=areaname;
    }
}
class Employee
{
    int E_id;
    String name;
    float salary;
    Address adr;
    
    public Employee(int E_id,String name,float salary,Address adr)
    {
        this.E_id=E_id;
        this.name=name;
        this.salary=salary;
        this.adr=adr;
    }
}
public class Has_A_constructor
{
    public static void main(String args[])
    {
        Address a=new Address("Amaravati","Sai nagar");
        Employee e=new Employee(123,"Sawali",50000,a);

        System.out.println(e.E_id);
        System.out.println(e.name);
        System.out.println(e.salary);
        System.out.println(e.adr.cityname);
        System.out.println(e.adr.areaname);
    }
}