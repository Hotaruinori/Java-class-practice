package Week03;

public class People {
    
    String name;
    int weight;

    
    public People(){
       name = "小美";
       weight = 50;
    }
    //沒寫的時候會呼叫空的，有寫參數的時候會呼叫有參數的，如果已有含參數的函式，但給空值會出現錯誤，所以寫有參數的時候會習慣上補一個無參數的空的。
    public People(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public static void main(String[] args) {

        People p1 = new People("小肥", 100);
        System.out.println(p1.name);
        System.out.println(p1.weight);
        p1.SayHi();

        
    }

    public void SayHi(){
        System.out.println("Hi, my name is " + name + " and my weight is " + weight + " kg.");

    }



}
