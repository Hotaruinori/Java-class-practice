import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有itemEvent
public class ch28_5 {	
	static Frame frm = new Frame("ch28_5");			
	static Choice ch = new Choice();					// 建立Choice物件ch
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ItemListener{	// 內部類別
		public void itemStateChanged(ItemEvent e) {		// 事件處理者
			String color = ch.getSelectedItem();		// 取得所按選項
			if (color == "Yellow")
				frm.setBackground(Color.yellow);		// 設背景是黃色
			else if (color == "Gray")
				frm.setBackground(Color.gray);			// 設背景是灰色
			else if (color == "Green")
				frm.setBackground(Color.green);			// 設背景是綠色
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.CENTER)); // 流動式版面配置
		frm.setSize(200, 160);							// 寬200, 高160	
		ch.add("Yellow");								// 將項目加入表單
		ch.add("Gray");
		ch.add("Green");
		ch.select(0);									// 選取index 0項目
		frm.setBackground(Color.yellow);				// 預設背景是黃色
		ch.addItemListener(new myListener());			// --- 註冊	
		frm.add(ch);									// 將Choice加入視窗	
		frm.setVisible(true);							// 顯示視窗	
	}	
}

