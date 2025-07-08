import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ShowString extends Frame {

    public ShowString(String title) {
        super(title);
        setSize(800, 200);
        setLocation(200, 250);

        // 點擊視窗關閉按鈕時結束程式
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();   // 關閉視窗
                System.exit(0); // 結束程式
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);  // 確保父類別也繪製
        String message = "床前明月光，疑似地上霜。舉頭望明月，低頭思故鄉。";

        // 建立標楷體，粗體，大小28
        Font font = new Font("標楷體", Font.BOLD, 28);
        g.setFont(font);
        g.setColor(Color.RED);
        g.drawString(message, 25, 100);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ShowString frm = new ShowString("顯示字串");
            frm.setVisible(true);
        });
    }
}

/**
為什麼需要 super.paint(g)？
1. 繼承鏈的繪圖責任
	Frame 繼承自 Window → Container → Component，每個父類別的 paint() 方法都有各自的繪圖工作：
	Component.paint()：繪製基本組件邊框和背景
	Container.paint()：繪製子組件
	Window/Frame.paint()：繪製標題列、邊框等視窗元素
	
	若跳過 super.paint(g)，這些基礎繪製會被忽略，可能導致：
	背景未清除（殘留前幀畫面）
	子組件消失
	視窗裝飾（如標題列）異常

2. 雙緩衝問題
	AWT 使用雙緩衝技術時，super.paint(g) 會確保緩衝區正確初始化。跳過它可能導致畫面閃爍或殘影。

**/