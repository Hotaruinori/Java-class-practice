import java.awt.*;									// 匯入類別庫
import java.awt.event.*;							// 因為有ActionEvent類別
public class ch27_2 {	
	static Frame frm = new Frame("ch27_2");
	static Button btn = new Button("請按我");
// 擔任事件傾聽者和擁有事件處理者
	static class MyListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			frm.setBackground(Color.gray);				// 背景轉呈黃色
		}
	}
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());				// 流動式版面配置
		frm.setSize(200, 120);							// 寬200, 高120
		frm.setBackground(Color.yellow); 				// 視窗背景是黃色	
		btn.addActionListener(new MyListener());		// --- 註冊
		frm.add(btn);									// 將功能鈕加入視窗						
		frm.setVisible(true);							// 顯示視窗	
	}	
}

