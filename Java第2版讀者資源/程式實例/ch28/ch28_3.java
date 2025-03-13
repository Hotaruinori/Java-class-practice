import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有itemEvent
public class ch28_3 {	
	static Frame frm = new Frame("ch28_3");			
	static List lst = new List();						// 建立List物件lst
	static TextField tf = new TextField();				// 建立TextField物件tf
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements ItemListener{	// 內部類別
		public void itemStateChanged(ItemEvent e) {		// 事件處理者
			String str = lst.getSelectedItem();			// 取得所按選項
			tf.setText(str);							// 將選項加入tf
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(new FlowLayout(FlowLayout.CENTER)); // 流動式版面配置
		frm.setSize(200, 160);							// 寬200, 高160	
		lst.add("明志科大");							// 將項目加入表單
		lst.add("台灣科大");
		lst.add("台灣大學");
		lst.add("清華大學");
		lst.add("長庚大學");
		lst.select(0);									// 選取index 0項目
		lst.addItemListener(new myListener());			// --- 註冊	
		tf.setText(lst.getSelectedItem());				// 列出最初所選項目
		frm.add(tf);									// 將tf加入視窗
		frm.add(lst);									// 將lst加入視窗	
		frm.setVisible(true);							// 顯示視窗	
	}	
}

