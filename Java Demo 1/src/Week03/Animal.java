package Week03;

public class Animal {
    String name;

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "小黃";
        dog.Hi(dog);    

        Animal cat = new Animal();
        cat.name = "小花";
        cat.Hi(cat);


    }


    public void Hi(Animal animal){
        System.out.println("Hi" + animal.name + "和你打招呼");
    
    }
}
