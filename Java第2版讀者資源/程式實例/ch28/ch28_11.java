import java.awt.*;									// 匯入類別庫
import java.awt.event.*;							// 因為有Event
public class ch28_11 {	
	static Frame frm = new Frame("ch28_11");		
	static Button btn1 = new Button("Demo");		
	static Button btn2 = new Button("Exit");
	static Dialog dialog = new Dialog(frm,"MyDialog");		
	static Label lab = new Label("歡迎使用對話方塊");
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{		
		public void actionPerformed(ActionEvent e) {
			Button btn = (Button) e.getSource( );
			if (btn == btn1) {						// 視窗按鈕被按
				dialog.setLayout(null);				// 不設定版面配置	
				dialog.setSize(150,120);			// 對話方塊大小		
				lab.setBounds(35,50,150,20);		// 標籤位置與大小
				dialog.add(lab);					// 標籤加入對話方塊
				btn2.setBounds(70,80,30,20);		// 按鈕位置與大小
				dialog.add(btn2);					// 按鈕加入對話方塊
				dialog.setVisible(true);			// 顯示對話方塊
			}
			else if (btn == btn2) {					// 對話方塊按鈕被按		
				dialog.setVisible(false);			// 隱藏對話方塊
			}
		}
	}
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());			// 設定版面配置		
		btn1.addActionListener(new myListener()); 	// 註冊
		btn2.addActionListener(new myListener()); 	// 註冊									
		frm.add(btn1);								// 按鈕加入視窗
		frm.setSize(200, 150);						// 寬200, 高150
		frm.setVisible(true);						// 顯示視窗
	}
}

