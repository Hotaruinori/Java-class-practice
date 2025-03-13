import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有ActionEvent
public class ch27_8 {	
	static Frame frm = new Frame("ch27_8");
	static TextField tf1 = new TextField();				// 建立TextField 1
	static TextField tf2 = new TextField();				// 建立TextField 2
	static TextField tf3 = new TextField();				// 建立TextField 3
	static Button btnPlus = new Button("+");			// 建立加法button
	static Button btnMinus = new Button("-");			// 建立減法button
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 實作ActionListener
		public void actionPerformed(ActionEvent e) {		// 事件處理者
			String str1 = tf1.getText();				// 讀取第一個數字
			String str2 = tf2.getText();				// 讀取第二個數字
			int x = Integer.parseInt(str1);				// 解析整數
			int y = Integer.parseInt(str2);				// 解析整數
			int result = 0;
			if (e.getSource() == btnPlus)				// 檢查是否按加法鈕
				result = x + y;							// 執行加法
			else if(e.getSource() == btnMinus)			// 檢查是否按減法鈕
				result = x - y;							// 執行減法
			tf3.setText(String.valueOf(result));		// 寫入結果
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// 不使用版面配置
		frm.setSize(350, 280);							// 寬350, 高280	
		tf1.setBounds(100, 50, 150, 20);				// 設定文字方塊位置
		tf2.setBounds(100, 100, 150, 20);
		tf3.setBounds(100, 150, 150, 20);
		btnPlus.setBounds(100, 200, 60, 60);			// 設定按鈕位置
		btnMinus.setBounds(190, 200, 60, 60);
		btnMinus.addActionListener(new myListener());	// --- 註冊
		btnPlus.addActionListener(new myListener());	// --- 註冊	
		tf3.setBackground(Color.yellow);				// 文字背景是黃色		
		frm.add(tf1);frm.add(tf2);frm.add(tf3);			// 將3個文字方塊加入視窗	
		frm.add(btnMinus);frm.add(btnPlus);				// 將2個按鈕加入視窗
		frm.setVisible(true);							// 顯示視窗	
	}	
}

