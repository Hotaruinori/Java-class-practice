package Part2.Unit15_OO;
interface IShape{
    static final double PI=Math.PI;
    abstract void area();
}

interface IColor{
    abstract void setColor(String str);
    abstract void area();
}

//interface ALL extends IShape,IColor {}

class CCircle implements IShape,IColor{  //實作IShape與IColor介面

    double radius;
    String color;
   
    public CCircle(double r){
        radius=r;
    }
 
    public void area(){ 
        System.out.println("面積=" + PI*Math.pow(radius,2.0));      
    }
   
    public void setColor(String str){  
        color=str;
        System.out.println("顏色=" + color); 
    }
}


public class Ex15_Interface{
    public static void main(String[] args){
        CCircle cir;
        cir=new CCircle(14.0); 
        cir.setColor("Blue");
        cir.area();
   }
}
