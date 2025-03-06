package java_homework1;
import java.util.regex.*;

public class TaiwanIDValidator {
    
    public static boolean validateTaiwanID(String id) {
        // 身分證字號的正規表達式
        String regex = "^[A-Z][12]\\d{8}$";
        if (!id.matches(regex)) {
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

        // 取得身分證的前9位數字
        String numberPart = id.substring(1);

        // 計算校驗碼
        int sum = 0;
        sum += firstLetterValue / 10;  // 取字母的十位數
        sum += firstLetterValue % 10;  // 取字母的個位數

        // 計算後9個數字的權重
        for (int i = 0; i < 9; i++) {
            sum += (numberPart.charAt(i) - '0') * (8 - i);
        }

        // 校驗碼必須為10的倍數
        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        String id = "A123456789"; // 測試用身分證字號

        if (validateTaiwanID(id)) {
            System.out.println("身分證字號合法！");
        } else {
            System.out.println("身分證字號不合法！");
        }
    }
}