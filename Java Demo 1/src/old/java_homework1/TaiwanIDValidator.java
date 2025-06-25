package java_homework1;
import java.util.Scanner;
public class TaiwanIDValidator {
    public static void main(String[] args) {
        Scanner idinput = new Scanner(System.in);
        boolean isValid;
        // 如果輸入錯誤會再執行
        do{
            System.out.println("請輸入身分證字號：");
            String id = idinput.next();
            isValid = result(id);
        }
        while(!isValid);
        idinput.close(); 
    }

    public static boolean result(String id){
        // 依照最後的計算結果作輸出
        if (validateTaiwanID(id)) {
            System.out.println("身分證字號合法！");
            return true;
        } 
        else {
            System.err.println("身分證字號不合法！");
            return false;
        }
    }
    
    public static boolean validateTaiwanID(String id) {
        // 身分證字號的正規表達式
        String regex = "^[A-Z][12]\\d{8}$";
        if (!id.matches(regex)) {
            System.err.println("身分證字號不符合格式！(英文需大寫)");
            return false; // 不符合格式
        }
        // 計算校驗碼
        return checkChecksum(id);
    }

    private static boolean checkChecksum(String id) {
        // 身分證字號的每個字母對應的數字
        String alphabet = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
        
        // 取得第一個字母的對應數字
        int firstLetterValue = alphabet.indexOf(id.charAt(0)) + 10;
        System.out.println("firstLetterValue: " + firstLetterValue);

        // 取得身分證的前9位數字
        String numberPart = id.substring(1);
        System.out.println("numberPart: " + numberPart);

        // 計算英文字首加權
        int sum = (firstLetterValue / 10) * 1 + (firstLetterValue % 10) * 9;
        System.out.println("英文字首計算: " + sum);

        // 計算後9個數字的權重
        //int sum2 = 0;
        for (int i = 0; i < 9; i++) {
            sum += (numberPart.charAt(i) - '0') * (8 - i);
        }
        sum += (numberPart.charAt(8) - '0');

        // 校驗碼必須為10的倍數
        System.out.println("sum校驗: " + sum);
        return sum % 10 == 0;
    }

}