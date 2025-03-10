package Week03;

class inheritace1 {
    
    String name;
    int age;

    public void eat(){
        System.out.println(this.name + "在吃東西");
    }
}



public class Cat extends inheritace1{
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.eat();
        cat1.play();
    }

    public void play(){
        System.out.println(this.name + "在玩遊戲");
    }

    public void eat(){ // 子類可以覆蓋掉parent的constructor
        System.out.println(this.name + "在吃東西，而且很快");
    }
}


