package Part2.Unit15_OO.Ex12_Polymorphismm;
class Manager  //經理
{ 
    private String name;
    private byte age;

    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(byte age)
    {
        if(age > 20)
        {
            this.age=age;
        }
    }
    
    public byte getAge()
    {
        return age;
    }
    
    public int getSalary()
    {
        return 65000;
    }
}


class Rector   //主任
{ 
    private String name;
    private byte age;

    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(byte age)
    {
        if(age > 20)
        {
            this.age=age;
        }
    }
    
    public byte getAge()
    {
        return age;
    }
         
    public int getSalary()
    {
        return 40000;
    }
}


class Secretary  //秘書 
{
    private String name;
    private byte age;

    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setAge(byte age)
    {
        if(age > 20)
        {
            this.age=age;
        }
    }
    
    public byte getAge()
    {
        return age;
    }
    
    public int getSalary()
    {
        return 32000;
    }
}


public class Polymorphism1
{
   public static void main(String[] args)
   {
      Manager lily = new Manager(); 
      System.out.println(lily.getSalary());
       
      Rector lulu = new Rector(); 
      System.out.println(lulu.getSalary());
       
      Secretary nana = new Secretary();
      System.out.println(nana.getSalary()); 
   }
}  