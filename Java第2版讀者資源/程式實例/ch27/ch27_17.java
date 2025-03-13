import java.awt.*;										// 匯入類別庫
import java.awt.event.*;								// 因為有Event
public class ch27_17 {	
	static Frame frm = new Frame("ch27_17");
// 擔任事件傾聽者和擁有事件處理者
	static class myListener extends WindowAdapter { 	// 繼承WindowAdapter
		public void windowClosing(WindowEvent e) { 		// windowClosing事件處理者
			System.out.println("windowClosing");
			frm.dispose();								// 釋放frm視窗資源再關閉視窗
		}
	}
	public static void main(String[] args) {		
		frm.setLayout(null);							// 不設版面配置
		frm.setSize(300, 160);							// 寬300, 高160	
		frm.addWindowListener(new myListener());		// --- 註冊		
		frm.setVisible(true);							// 顯示視窗	
	}	
}

