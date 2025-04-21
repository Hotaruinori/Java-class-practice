package Part1.Basic7_String.String.Lab;
// 03 王鈞弘 2025/04/15
import java.util.Scanner;
public class trees_diamond2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean game_is_on = true;
        
        do {
            System.out.print("輸入列數(奇數, 0=END)：");
            String input = sc.nextLine();
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                continue;
            }
            int tree_levels = Integer.parseInt(input);

            if (tree_levels % 2 == 1) {
                DiamondPrinter2 d = new DiamondPrinter2();
                game_is_on = d.draw_tree(tree_levels);
            }
            else if (tree_levels == 0) {
                game_is_on = false;
                System.out.println("See you !");
                System.out.println("Press any key to continue...");
            }
        }
        while(game_is_on);
        sc.close();

    }
}
class DiamondPrinter2 {
    public boolean draw_tree(int tree_levels) {
        // 列印菱形
        int i, j;
        int center = (tree_levels + 1)/ 2 ;
        for (i = -center + 1 ; i <= center -1 ; i++) {
            for (j = 1; j <= tree_levels; j++) {
                if ( j <=  Math.abs(i)  ||  j > tree_levels - Math.abs(i) ) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                }
            System.out.println();
        }
        return true;
    }
}
// input = 9 , center = 5
//  (j <= 4 || j >= 6)  i = -4   
//  (j <= 3 || j >= 7)  i = -3 
//  (j <= 2 || j >= 8)  i = -2 
//  (j <= 1 || j >= 9)  i = -1 
//  (j <= 0 || j >= 10) i = -0 