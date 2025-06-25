package Week03;

public class Numberadd {
    
    int a;
    int b;
    String name;

    public static void main(String[] args) {
        Numberadd add1 = new Numberadd();
        add1.name = "小明";
        add1.a = 3;
        add1.b = 4;
        add1.PrintName(add1.name);
        add1.Addmethod(add1.a, add1.b);
        add1.Multiplymethod(add1.a, add1.b);

        Numberadd add2 = new Numberadd();
        add2.name = "小華";
        add2.a = 8;
        add2.b = 9;
        add2.PrintName(add2.name);
        add2.Addmethod(add2.a, add2.b);
        add2.Multiplymethod(add2.a, add2.b);
    }


    public void Addmethod(int a, int b){
        System.out.println("相加= " + a+b);
    
    }
    public void Multiplymethod(int a, int b){
        System.out.println("相乘 =" + a*b);
    
    }
    public void PrintName(String name){
        System.out.println("姓名=" + name);
    }
}
