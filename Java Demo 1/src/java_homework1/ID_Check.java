package java_homework1;
//import java.lang.reflect.Array;

public class ID_Check {
    public static void main(String[] args) {
    
        String id = "A123456785";

        boolean flag = true;
        

        for (int i = 0; i < id.length(); i++) {
            
            if (i==0){
                flag = flag && Character.isLetter(id.charAt(i));
            }
            else{
                flag = flag && Character.isDigit(id.charAt(i));
            }
        }

        if (flag == true){
            System.out.println("身分證驗證正確");
        
        }
        else{
            System.out.println("身分證驗證失敗");
        }

    private static int getLetterValue(char letter) {
            // 每個字母對應的數字
            switch (letter) {
                case 'A': return 10;
                case 'B': return 11;
                case 'C': return 12;
                case 'D': return 13;
                case 'E': return 14;
                case 'F': return 15;
                case 'G': return 16;
                case 'H': return 17;
                case 'I': return 34;
                case 'J': return 18;
                case 'K': return 19;
                case 'L': return 20;
                case 'M': return 21;
                case 'N': return 22;
                case 'O': return 35;
                case 'P': return 23;
                case 'Q': return 24;
                case 'R': return 25;
                case 'S': return 26;
                case 'T': return 27;
                case 'U': return 28;
                case 'V': return 29;
                case 'W': return 32;
                case 'X': return 30;
                case 'Y': return 31;
                case 'Z': return 33;
                default: return -1; // 無效字母
            } 
    }
}
