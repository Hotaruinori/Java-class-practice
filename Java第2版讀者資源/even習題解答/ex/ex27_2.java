import java.awt.*;									// 匯入類別庫
import java.awt.event.*;							// 因為有ActionEvent類別
public class ex27_2 {	
	static Frame frm = new Frame("ex27_2");
	static Button btn1 = new Button("接受");
	static Button btn2 = new Button("拒絕");
	static Button btn3 = new Button("結束");
	static TextField txt = new TextField("                 ");
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ActionListener{	// 內部類別
		public void actionPerformed(ActionEvent e) {	// 事件處理者
			Button btn = (Button) e.getSource();		// 取得所按物件
			if (btn == btn1)
				txt.setText("你按了接受鈕, 感謝你");
			else if(btn == btn2)
				txt.setText("你按了拒絕鈕, 感謝你");
			else {
				txt.setText("你按了結束鈕, 下回見");
				System.exit(0);							// 程式結束關閉視窗
			}	
		}
	}
	public static void main(String[] args) {
		frm.setLayout(new FlowLayout());				// 流動式版面配置
		frm.setSize(200, 120);							// 寬200, 高120
		btn1.addActionListener(new myListener());		// --- 註冊
		btn2.addActionListener(new myListener());		// --- 註冊
		btn3.addActionListener(new myListener());		// --- 註冊
		
		txt.setBounds(80, 80, 150, 120);
		
		frm.add(btn1);									// 將接受鈕加入視窗	
		frm.add(btn2);									// 將拒絕鈕加入視窗
		frm.add(btn3);									// 將結束鈕加入視窗
		frm.add(txt);
		frm.setVisible(true);							// 顯示視窗	
	}	
}

