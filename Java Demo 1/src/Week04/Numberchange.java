package Week04;

public class Numberchange {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println( "a = " + a + " b = " + b );

        //將a與b交換
        int temp = a; // 將a的值存入temp中
        a = b; // 將b的值存入a中
        b = temp; // 將temp的值存入b中

        System.out.println( "a = " + a + " b = " + b );
        System.out.println(String.format( "交換前 a = %d, b = %d", a, b));


        int A = 5;
        int B = 10;

        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println(String.format("交換後 a = %d, b = %d", A, B));

    
    }
}
