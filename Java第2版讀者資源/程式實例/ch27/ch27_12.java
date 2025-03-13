import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ch27_12 {	
	static Frame frm = new Frame("ch27_12");
	static Label lab = new Label();						// 標籤
	static Button btn = new Button("Click Me");			// 按鈕
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements MouseListener{	// 實作MouseListener
		public void mouseClicked(MouseEvent e) { 		// mouseClicked事件處理者
			lab.setText("Mouse Clicked");
		}
		public void mouseEntered(MouseEvent e) { 		// mouseEntered事件處理者
			lab.setText("Mouse Entered");
		}
		public void mouseExited(MouseEvent e) {			// mouseExited事件處理者
			lab.setText("Mouse Exited");
		}
		public void mousePressed(MouseEvent e) { 		// mousePressed事件處理者
			lab.setText("Mouse Pressed");
		}
		public void mouseReleased(MouseEvent e) { 		// mouseReleased事件處理者
			lab.setText("Mouse Released");
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// 不設版面配置
		frm.setSize(300, 160);							// 寬300, 高160	
		lab.setBounds(30,50, 200, 20);					// 標籤位置與大小			
		btn.setBounds(120, 120, 60, 20);				// 按鈕位置與大小
		btn.addMouseListener(new myListener());			// --- 註冊	
		frm.add(lab);									// 將lab加入視窗	
		frm.add(btn);									// 將btn加入視窗		
		frm.setVisible(true);							// 顯示視窗	
	}	
}

