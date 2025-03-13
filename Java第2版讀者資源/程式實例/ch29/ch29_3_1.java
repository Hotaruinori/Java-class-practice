import javax.swing.*;							// 匯入類別庫
import java.awt.*;										
public class ch29_3_1 {	
	static JFrame jfrm = new JFrame("ch29_3_1");
	static JButton btn = new JButton("OK");
	public static void main(String[] args) {
		jfrm.add(btn);							// 在JFrame建立按鈕	
		jfrm.setSize(200, 160);					// 寬200, 高160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);					// 顯示視窗
	}
}

