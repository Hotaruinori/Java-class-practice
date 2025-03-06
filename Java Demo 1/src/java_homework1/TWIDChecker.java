package java_homework1;
public class TWIDChecker {

    // 台灣身份證字母對應的數字
    private static final int[] LETTER_TO_NUMBER = {
        10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21,
        22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31, 33
    };

    // 檢查台灣身份證號碼是否有效
    public static boolean isValidTWID(String twId) {
        // 檢查長度是否為10
        if (twId == null || twId.length() != 10) {
            return false;
        }

        // 檢查第一個字是否為英文字母
        char firstChar = twId.charAt(0);
        if (!Character.isLetter(firstChar)) {
            return false;
        }

        // 檢查第二個字是否為1或2
        char secondChar = twId.charAt(1);
        if (secondChar != '1' && secondChar != '2') {
            return false;
        }

        // 檢查後8碼是否為數字
        for (int i = 2; i < 10; i++) {
            if (!Character.isDigit(twId.charAt(i))) {
                return false;
            }
        }

        // 將字母轉換為數字
        int letterNumber = LETTER_TO_NUMBER[Character.toUpperCase(firstChar) - 'A'];

        // 計算加權總和
        int sum = (letterNumber / 10) * 1 + (letterNumber % 10) * 9;
        for (int i = 1; i < 9; i++) {
            sum += (twId.charAt(i) - '0') * (9 - i);
        }
        sum += (twId.charAt(9) - '0'); // 最後一位乘以1

        // 檢查是否能被10整除
        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        String twId = "A123456789"; // 示例身份證號碼
        if (isValidTWID(twId)) {
            System.out.println("身份證號碼有效");
        } else {
            System.out.println("身份證號碼無效");
        }
    }
}