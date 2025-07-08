package Week04;

public class MultiplicationTable {
    public static void main(String[] args) {
      
        for (int i = 1; i <= 10; i++ ){
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%-2d* %-2d= %-4d", i, j, i * j);
            }
            System.out.println();
        
        }
    }


}
