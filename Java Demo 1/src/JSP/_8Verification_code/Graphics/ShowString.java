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
