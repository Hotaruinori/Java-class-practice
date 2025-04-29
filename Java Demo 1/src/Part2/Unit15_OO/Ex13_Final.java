package Part2.Unit15_OO;

class Vehicle                    //Vehicle類別宣告                     
{
    private String carNo;         //車牌號碼                       
    private String owner;         //所有人
   
    final String getNumber()
    { 
        return this.carNo;
    }
   
    final String getOwner() 
    {
        return this.owner; 
    }
   
    final void setNumber(String no) 
    {
        this.carNo = no; 
    }
   
    final void setOwner(String owner) 
    { 
        this.owner = owner; 
    }
}


final class Car extends Vehicle
{
    private int doors;
    public Car(String owner, String no, int doors)
    {
        setNumber(no);            //呼叫父類別的方法
        setOwner(owner);
        this.doors = doors;   
    }
   
    public void printCar()       //顯示轎車資料
    {
        System.out.println("====轎車資料====");
        System.out.println("所有人: " + getOwner());
        System.out.println("幾門: " + doors);
        System.out.println("車牌號碼: " + getNumber()); 
    }    
}

//class SuperCar extends Car { }


public class Ex13_Final
{ 
    public static void main(String[] args) 
    {
        Car peugeot = new Car("Ted", "AFN-1019", 2);
        peugeot.printCar();
    }
}