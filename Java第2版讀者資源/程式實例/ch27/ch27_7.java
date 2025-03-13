import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有TextEvent
public class ch27_7 {	
	static Frame frm = new Frame("ch27_7");
	static TextArea ta1 = new TextArea("",10,40);		// 預設顯示垂直卷軸
	static TextArea ta2 = new TextArea("",10,40);		// 預設顯示垂直卷軸
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements TextListener{	// 實作TextListener
		public void textValueChanged(TextEvent e) {		// 事件處理者
			ta2.setText(ta1.getText());					// 複製ta1內容到ta2
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(new GridLayout(2, 1));			// 方格版面配置
		frm.setSize(200, 140);							// 寬200, 高140			
		ta1.addTextListener(new myListener());			// --- 註冊
		ta2.setEditable(false);							// 設為不可編輯		
		ta2.setBackground(Color.yellow);				// 文字背景是黃色		
		frm.add(ta1);									// 將cb1加入視窗	
		frm.add(ta2);									// 將cb2加入視窗		
		frm.setVisible(true);							// 顯示視窗	
	}	
}

