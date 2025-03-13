import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ch27_10 {	
	static Frame frm = new Frame("ch27_10");
	static Label lab = new Label();						// 標籤
	static TextArea ta = new TextArea();				// 文字區塊
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements KeyListener{		// 實作KeyListener
		public void keyPressed(KeyEvent e) {}			// KeyPressed事件處理者
		public void keyReleased(KeyEvent e) {			// KeyReleased事件處理者
			String text = ta.getText();
			String[] words = text.split("\\s");			// 空白分割句子
			lab.setText("字數 : " + words.length + "  字元數 : " + text.length());
		}
		public void keyTyped(KeyEvent e) {}				// KeyTyped事件處理者
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// 不設版面配置
		frm.setSize(300, 160);							// 寬300, 高160	
		lab.setBounds(30,50, 200, 20);					// 標籤位置與大小			
		ta.setBounds(30, 80, 240, 60);					// 文字區塊位置與大小
		lab.addKeyListener(new myListener());			// --- 註冊
		ta.addKeyListener(new myListener());			// --- 註冊	
		frm.add(lab);									// 將lab加入視窗	
		frm.add(ta);									// 將ta加入視窗		
		frm.setVisible(true);							// 顯示視窗	
	}	
}

