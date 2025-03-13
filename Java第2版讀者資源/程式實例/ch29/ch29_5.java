import javax.swing.*;									// 匯入類別庫
import java.awt.*;	
import java.awt.event.*;									
public class ch29_5 {	
	static JFrame jfrm = new JFrame("ch29_5");
	static JButton btn = new JButton("Yellow");
	static Container ct  = jfrm.getContentPane();		// 取得內容窗格物件
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			ct.setBackground(Color.yellow);				// 背景轉呈黃色
		}
	}
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());					// 設定流動版面配置
		ct.add(btn);									// 在內容窗格建立按鈕
		btn.addActionListener(new myListener());		// --- 註冊
		ct.setBackground(Color.green);					// 內容窗格底色是綠色
		jfrm.setSize(200, 160);							// 寬200, 高160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);							// 顯示視窗
	}
}

