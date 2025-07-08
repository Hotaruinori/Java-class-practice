// 所有 x 都加 1
package Part2.Unit19_InnerClass.Member.Lab;
class BaseClass{
    int x=200;
}    
  
   
class Outer2 extends BaseClass{
    int x=5;
   
    class Inner{
        int x=10;
        public void addX(int x){
            //x加 1          
            System.out.println("執行前 :");  
            System.out.println("變數x=" + (x + 1));
            System.out.println("內部類別的x=" + (this.x +1) );
            System.out.println("外部類別的x=" + (Outer2.this.x + 1 ));
            System.out.println("基礎類別的x=" +  ( Outer2.super.x + 1 ));       
        }    
          
        public void showAllX(){
            System.out.println("執行前 :");  
            System.out.println("變數x=" + (x ));
            System.out.println("內部類別的x=" + (this.x ) );
            System.out.println("外部類別的x=" + (Outer2.this.x ));
            System.out.println("基礎類別的x=" +  (Outer2.super.x  ));  
        }  
    } 
}


public class Lab_SetAttribute2{   
    public static void main(String[] args){
        Outer2.Inner inn = new Outer2().new Inner();
        inn.addX(15);
        inn.showAllX();
        
    }  
}