package Part1.Basic7_String.String.Lab;
// 03 王鈞弘 2025/04/15
import java.util.Scanner;
public class trees_diamond {
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
                DiamondPrinter d = new DiamondPrinter();
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
class DiamondPrinter {
    public boolean draw_tree(int tree_levels) {
        // 列印菱形
        int i, j;
        int center = (tree_levels + 1)/ 2 ;
        for (i = 1; i <= tree_levels; i++) {
            for (j = 1; j <= tree_levels; j++) {
                // 使用距離（|x - center| + |y - center|）來判斷是否在菱形範圍內
                if (Math.abs(i - center) + Math.abs(j - center) <= center-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            }
        return true;
        }
}
