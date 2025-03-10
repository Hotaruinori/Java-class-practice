package Week03;

public class inheritance_Son extends inheritance_Father{
    public static void main(String[] args) {
        inheritance_Son son1 = new inheritance_Son();
        //當建立子類物件時, 默認會先執行父類不帶參數的建構子方法，後續執行子類別的建構子
        System.out.println(son1.x);
        System.out.println(son1.y);
        son1.giveMoney();
    }

    public inheritance_Son(){
        super(2000); //必須寫在子類constructor的第一行，當父類沒有不帶參數的建構子, 子類必須使用super顯式的調用父類的建構子
        System.out.println("我是子類別的建構子");

    }
    
}
