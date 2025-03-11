package Week03;

import java.util.Random;

public class radom {
    public static void main(String[] args) {
		
        // 創建一個 Random 物件
        Random random = new Random();

        // 產生任何 Integer 的隨機數
        int randomNumber = random.nextInt();
        System.out.println("Random Number: " + randomNumber);
        // 產生1到50之間的隨機數 ，本來是產生0~49所以要+1
        int randomNumber2;  //放在外面避免每次都重創變數
        for (int i=0; i < 10; i++){
            randomNumber2= random.nextInt(50)+1;
            System.out.println("Random Number between 1 and 50: " + randomNumber2);
        }
        // 數學常數
        System.out.println("Math E = " + Math.E);
        System.out.println("Math PI = " + Math.PI);
        //大小值
        int X1 = 30 ;
        int X2 = 50 ;
        System.out.println(Math.max(X1, X2));
        System.out.println(Math.min(X1, X2));

        //4捨五入 Math.round
        float x1 = -3.1499f;
        float x2 = -3.51f;
        System.out.println(Math.round(x1));
        System.out.println(Math.round(x2));
        double y1 = 5.499;
        double y2 = 4.5;
        System.out.println(Math.round(y1));
        System.out.println(Math.round(y2));

     
    }
}
