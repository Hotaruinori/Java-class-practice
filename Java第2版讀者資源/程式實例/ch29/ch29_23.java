import javax.swing.*;								// 匯入類別庫
import java.awt.*;		
import java.awt.event.*;								
public class ch29_23 {	
	static JFrame jfrm = new JFrame("ch29_23");
	static Container ct  = jfrm.getContentPane();	// 取得內容窗格物件
	static JTextField tf1 = new JTextField("歡迎");	// 建立文字方塊
	static JTextField tf2 = new JTextField("深石");	// 建立文字方塊
	static JButton btn = new JButton("Changed");	// 建立按鈕
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			String str1 = tf1.getText();			// 取得文字方塊1內容
			String str2 = tf2.getText();			// 取得文字方塊2內容
			if (e.getSource() == btn) {
				tf1.setText(str2);					// 設定文字方塊1內容
				tf2.setText(str1);					// 設定文字方塊2內容
			}
		}
	}	
	public static void main(String[] args) {
		ct.setLayout(null);							// 不設版面配置
// 設定元件在版面位置		
		tf1.setBounds(50,30,120,20);				
		tf2.setBounds(50,80,120,20);
		btn.setBounds(50,140,100,30);
// 將元件放入內容窗格		
		ct.add(tf1);								
		ct.add(tf2);
		ct.add(btn);
// 執行註冊
		btn.addActionListener(new myListener());	// --- 註冊
// 設定視窗大小和可以顯示與結束程式					
		jfrm.setSize(260,220);						// 寬260, 高220
		jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
		jfrm.setVisible(true);						// 顯示視窗
	}
}

