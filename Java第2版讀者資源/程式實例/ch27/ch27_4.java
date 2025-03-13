import java.awt.*;									// 匯入類別庫
import java.awt.event.*;							// 因為有ActionEvent類別
public class ch27_4 {	
	static Frame frm = new Frame("ch27_4");
	static Button btn1 = new Button("黃色");
	static Button btn2 = new Button("綠色");
	static Button btn3 = new Button("結束");
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			String str = e.getActionCommand();			// 取得所按物件名稱
			if (str.equals("黃色"))
				frm.setBackground(Color.yellow);		// 背景轉呈黃色
			else if(str.equals("綠色"))
				frm.setBackground(Color.green);			// 背景轉呈黃色
			else
				System.exit(0);							// 程式結束關閉視窗
		}
	}
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());				// 流動式版面配置
		frm.setSize(200, 120);							// 寬200, 高120
		btn1.addActionListener(new myListener());		// --- 註冊
		btn2.addActionListener(new myListener());		// --- 註冊
		btn3.addActionListener(new myListener());		// --- 註冊
		frm.add(btn1);									// 將黃色鈕加入視窗	
		frm.add(btn2);									// 將綠色鈕加入視窗
		frm.add(btn3);									// 將結束鈕加入視窗
		frm.setVisible(true);							// 顯示視窗	
	}	
}

