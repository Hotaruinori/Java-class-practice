import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ch27_16 {	
	static Frame frm = new Frame("ch27_16");
// 擔任事件傾聽者和擁有事件處理者
	static class myListener implements WindowListener { // 實作WindowListener
		public void windowActivated(WindowEvent e) { 	// windowActivated事件處理者
			System.out.println("windowActivated");
		}
		public void windowClosed(WindowEvent e) { 		// windowClosed事件處理者
			System.out.println("windowClosed");	
		}
		public void windowClosing(WindowEvent e) { 		// windowClosing事件處理者
			System.out.println("windowClosing");
			frm.dispose();								// 釋放frm視窗資源再關閉視窗
		}
		public void windowDeactivated(WindowEvent e) { 	// windowDeactivated事件處理者
			System.out.println("windowDeactivated");
		}
		public void windowDeiconified(WindowEvent e) { 	// windowDeiconified事件處理者
			System.out.println("windowDeiconified");
		}
		public void windowIconified(WindowEvent e) { 	// windowIconified事件處理者
			System.out.println("windowIconified");
		}
		public void windowOpened(WindowEvent e) { 		// windowOpened事件處理者
			System.out.println("windowOpened");
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// 不設版面配置
		frm.setSize(300, 160);							// 寬300, 高160	
		frm.addWindowListener(new myListener());		// --- 註冊		
		frm.setVisible(true);							// 顯示視窗	
	}	
}

