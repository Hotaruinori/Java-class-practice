import javax.swing.*;									// 匯入類別庫
import java.awt.*;	
import java.awt.event.*;									
public class ex29_2 {	
	static JFrame jfrm = new JFrame("ex29_2");
	static JButton btn1 = new JButton("Yellow");
	static JButton btn2 = new JButton("Green");
	static JButton btn3 = new JButton("Blue");
	static Container ct  = jfrm.getContentPane();		// 取得內容窗格物件
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			JButton btn = (JButton) e.getSource();		// 取得所按物件
			if (btn == btn1)
				ct.setBackground(Color.yellow);			// 背景轉呈黃色
			else if(btn == btn2)
				ct.setBackground(Color.green);			// 背景轉呈綠色
			else if(btn == btn3)
				ct.setBackground(Color.blue);			// 背景轉呈藍色			
		}
	}
	public static void main(String[] args) {
		ct.setLayout(new FlowLayout());					// 設定流動版面配置
		ct.add(btn1);									// 在內容窗格建立按鈕
		ct.add(btn2);									// 在內容窗格建立按鈕
		ct.add(btn3);									// 在內容窗格建立按鈕
		btn1.addActionListener(new myListener());		// --- 註冊
		btn2.addActionListener(new myListener());		// --- 註冊
		btn3.addActionListener(new myListener());		// --- 註冊
		ct.setBackground(Color.green);					// 內容窗格底色是綠色
		jfrm.setSize(300, 160);							// 寬300, 高160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);							// 顯示視窗
	}
}

