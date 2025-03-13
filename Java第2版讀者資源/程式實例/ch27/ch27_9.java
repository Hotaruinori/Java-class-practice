import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ch27_9 {	
	static Frame frm = new Frame("ch27_9");
	static Label lab = new Label();						// 標籤
	static TextArea ta = new TextArea();				// 文字區塊
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements KeyListener{		// 實作KeyListener
		public void keyPressed(KeyEvent e) {			// KeyPressed事件處理者
			lab.setText("Key Pressed");					// 輸出Key Pressed
		}
		public void keyReleased(KeyEvent e) {			// KeyReleased事件處理者
			lab.setText("Key Released");				// 輸出Key Released
		}
		public void keyTyped(KeyEvent e) {				// KeyTyped事件處理者
			lab.setText("Key Typed");					// 輸出Key Typed
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// 不設版面配置
		frm.setSize(200, 160);							// 寬200, 高160	
		lab.setBounds(30,50, 100, 20);					// 標籤位置與大小			
		ta.setBounds(30, 80, 140, 60);					// 文字區塊位置與大小
		lab.addKeyListener(new myListener());			// --- 註冊
		ta.addKeyListener(new myListener());			// --- 註冊	
		frm.add(lab);									// 將lab加入視窗	
		frm.add(ta);									// 將ta加入視窗		
		frm.setVisible(true);							// 顯示視窗	
	}	
}

