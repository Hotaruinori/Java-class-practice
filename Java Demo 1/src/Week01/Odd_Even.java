package Week01;
public class Odd_Even {
    public static void main(String[] args) {
        int input = 10 ;
        int remaind = input % 2;

        if (remaind == 1){ // 餘數為1時是奇數
            System.out.printf("%d是奇數", input);
        }
        else{
            System.out.printf("%d是偶數", input);
        }
        
        //System.out.println("Hello, World!");
    }
}
