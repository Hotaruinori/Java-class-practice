import javax.swing.*;								// 匯入類別庫
import java.awt.*;		
import java.awt.event.*;								
public class ch29_21 {	
	static JFrame jfrm = new JFrame("ch29_21");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JButton btn = new JButton("My Color");	// 建立My Color按鈕
	static JColorChooser jcc = new JColorChooser();	// 建立jcc色彩物件
	static Color mycolor;							// 定義色彩
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			mycolor = jcc.showDialog(jfrm,"Swing Color Chooser",Color.yellow);
			ct.setBackground(mycolor);				// 設定內容窗格背景
		}
	}			
	public static void main(String[] args) {
		ct.setLayout(new BorderLayout());			// 設定邊界版面配置				
// 將元件放入內容窗格		
		ct.add(btn, BorderLayout.NORTH);			// 按鈕在下方
// 註冊傾聽者
		btn.addActionListener(new myListener());	// --- 註冊
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(200, 160);						// 寬200, 高160
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

