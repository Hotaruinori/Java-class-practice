package Part2.Unit15_OO.Ex12_Polymorphism;
//基礎類別
abstract class Employee{
    private String name;
    private byte age;

    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(byte age){
        if(age > 20){
            this.age=age;
        }
    }
    
    public byte getAge(){
        return age;
    }
    // 成員有抽象方法，必須是抽象class
    public abstract int getSalary();
}

//延伸類別 Manager
class Manager extends Employee  {     
    @Override
    public int getSalary(){
        return 65000;
    }
}
//延伸類別 Rector
class Rector extends Employee{   
    @Override
    public int getSalary(){
        return 40000;
    }
}

   //延伸類別 Secretary
class Secretary extends Employee{
    @Override
    public int getSalary(){
        return 32000;
    }
}


public class Polymorphism2{
    public static void main(String[] args)
    {
        // Employee lily = new Manager();
          
        Manager oo = new Manager();
        Employee lily = oo;
                 
        
        System.out.println(lily.getSalary()); 
        
        Employee lulu = new Rector();     
        System.out.println(lulu.getSalary()); 

        Employee nana = new Secretary();     
        System.out.println(nana.getSalary()); 
        
    }
}  