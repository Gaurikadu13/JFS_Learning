public void Set_get
{
    int rollno;
    String name;
    public void setRollno(int rollno)
    {
        this.rollno=rollno;
    }
    public int getRollno()
    {
        return rollno;
    }
    public void setName(int rollno)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public static void main(String args[])
    {
        Set_get s=new Set_get();
        Set_get s1=new Set_get();

        // System.out.println("Rollno : "+s.rollno+" Name : "+s.name);
        // System.out.println("Rollno : "+s1.rollno+" Name : "+s1.name);

        s.setRollno(3);
        s.setName("Priya");
        s.setRollno(4);
        s.setName("Riya");

        System.out.println(s.getRollno());
        System.out.println(s.getName());
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());



    }
}