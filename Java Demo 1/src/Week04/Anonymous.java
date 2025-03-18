package Week04;


interface Greeting {
    void sayHello();
}

public class Anonymous {
    public static void main(String[] args) {
        // 使用匿名類來實現介面 Greeting
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };
        greeting.sayHello(); // 呼叫匿名類的方法


        //創建了一個匿名的子類別，繼承自Greeting類別。
        new Greeting() {
            public void sayHello() {
                System.out.println("Hello");
            }
        }.sayHello();

            // Lambda
        Greeting myinterface2 = () -> System.out.println("Hello");
        myinterface2.sayHello();


    }




}
