package Week03;

public class People2 {
    int age = 20;
    public static void main(String[] args) {
        People2 p = new People2();
        int age = p.age;
        System.out.println(age);

        p.change(p);
        int age2 = p.age;
        System.out.println(age2);
    }

    public void change(People2 p){ //這邊的People2 p 是型態
        p = new People2();
        p.age = 30;

    }

}

