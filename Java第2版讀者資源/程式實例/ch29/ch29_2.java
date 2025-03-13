import javax.swing.*;						// 匯入類別庫
import java.awt.*;							// Image使用
public class ch29_2 {	
	static JFrame jfrm = new JFrame("ch29_2");
	public static void main(String[] args) {
		jfrm.setSize(200, 160);				// 寬200, 高160
// 將star.gif轉成Image物件im
		Image im = Toolkit.getDefaultToolkit().getImage("star.gif");
		jfrm.setIconImage(im);				// 更改圖示
// setDefaultCloseOperation()可以讓使用者按關閉紐時結束程式
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);				// 顯示視窗
	}
}

