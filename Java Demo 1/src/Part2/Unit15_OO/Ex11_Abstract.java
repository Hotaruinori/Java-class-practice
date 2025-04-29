package Part2.Unit15_OO;
abstract class Shape        //Shape抽象類別宣告                     
{
    public double x;                    
    public double y;
   
    abstract void area();    //抽象方法: 計算面積
    void getColor()
    {
        System.out.println("color is red");
    }
}


class Circle extends Shape  //Circle類別宣告
{
    public double r;         //半徑
    public Circle(double x, double y, double r)
    {
        this.x = x;
        this.y = y;
        this.r = r;   
    }
   
    public void area()       //實作抽象方法area()
    {
        System.out.println("圓面積: " + Math.PI*r*r);
    }    
}


class Rectangle extends Shape  //Rectangle類別宣告
{
    private double x1;          //X座標
    private double y1;          //Y座標
    public Rectangle(double x, double y, double x1, double y1)
    {
        this.x = x;      
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;   
    }
   
    public void area()
    {
        System.out.println("長方形面積: " + (y1-y)*(x1-x));
    }    
}
 
      
public class Ex11_Abstract
{ 
    public static void main(String[] args) 
    {
        Circle c1 = new Circle(5, 10, 400);
        System.out.println("=== 圓形c1的資料 ===");
        System.out.println("X座標: " + c1.x);
        System.out.println("Y座標: " + c1.y);
        c1.area();
        c1.getColor();
        System.out.println();
        
        Shape c2 = new Circle(5, 500, 400);
        System.out.println("=== 圓形c2的資料 ===");
        System.out.println("X座標: " + c2.x);
        System.out.println("Y座標: " + c2.y);
        c2.area();
        c2.getColor();
    }
}



        //System.out.println( c2 instanceof Shape );
        //System.out.println( c2 instanceof Circle );