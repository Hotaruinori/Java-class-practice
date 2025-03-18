package Week04;

// 定義一個抽象類
abstract class Animalmal {
    // 抽象方法
    abstract void makeSound();

    // 一個非抽象方法
    void eat() {
        System.out.println("The animal is eating.");
    }
}

public class Anonymous2 {
    public static void main(String[] args) {
        // 使用匿名類來實現抽象類 Animal
        Animalmal dog = new Animalmal() {
                void makeSound() {
                System.out.println("Woof! Woof!");
            }
        };

        // 呼叫匿名類的方法
        dog.makeSound();
        dog.eat();
    }
}
