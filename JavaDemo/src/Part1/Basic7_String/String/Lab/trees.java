package Part1.Basic7_String.String.Lab;
// 03 王鈞弘 2025/04/15
import java.util.Scanner;
public class trees {
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
            int center = (tree_levels + 1)/ 2 ;
            if (tree_levels % 2 == 1) {
                game_is_on = draw_tree(tree_levels, center);
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

    static boolean draw_tree(int tree_levels, int center) {
        // 正向
        int i, j;
        for ( i = 1; i <= center; i++) {
            for ( j = 1; j <= tree_levels; j++) {
                if (j <= center - i || j >= center + i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
         // 倒過來
        for ( i = 1; i < center; i++) {
            for ( j = 1; j <= tree_levels; j++) {
                if ( j <= i || j >= tree_levels - i + 1) {
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
